package ca.studymedia;

import ca.studymedia.dao.mybatis.example.UserExample;
import ca.studymedia.dao.mybatis.mapper.UserMapper;
import ca.studymedia.dao.mybatis.transaction.MyBatisTransaction;
import ca.studymedia.model.User;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyBatisTester {

    private static final String USER_NAME = "testUser";
    private static final String UPDATED_USER_NAME = USER_NAME + "UPDATED";

    @Test
    public void testCRUD() throws IOException {
        createUser();
        lookupUser();
        deleteAllUsers();
    }

    private void createUser() throws IOException {
        MyBatisTransaction myBatisTransaction = new MyBatisTransaction();
        myBatisTransaction.process(myBatisTransaction.new MyBatisTransactionProcessorAdapter() {
            @Override
            public void process() throws IOException {
                User testUser = User.newBuilder()
                        .withFirstname(USER_NAME)
                        .withLogin("TestLogin")
                        .withPassword("Password")
                        .withEmails("test@test.com")
                        .build();

                UserMapper userMapper = openSQLSession().getMapper(UserMapper.class);

                userMapper.insert(testUser);
            }
        });
    }

    private void lookupUser() throws IOException {
        MyBatisTransaction myBatisTransaction = new MyBatisTransaction();
        myBatisTransaction.process(myBatisTransaction.new MyBatisTransactionProcessorAdapter() {
            @Override
            public void process() throws IOException {
                UserExample userExample = new UserExample();
                userExample.createCriteria().andFirstnameEqualTo(USER_NAME);

                UserMapper userMapper = openSQLSession().getMapper(UserMapper.class);
                List<User> userList = userMapper.selectByExample(userExample);

                assertEquals("Expected order not found", 1, userList.size());

                updateOrder(userList.get(0));
            }
        });
    }

    private void updateOrder(final User user) throws IOException {
        MyBatisTransaction myBatisTransaction = new MyBatisTransaction();
        myBatisTransaction.process(myBatisTransaction.new MyBatisTransactionProcessorAdapter() {
            @Override
            public void process() throws IOException {
                UserMapper userMapper = openSQLSession().getMapper(UserMapper.class);

                //update the order
                UserExample userSearchCriteria = new UserExample();
                userSearchCriteria.createCriteria().andUseridEqualTo(user.getUserid());
                user.setFirstname(UPDATED_USER_NAME);
                userMapper.updateByExample(user, userSearchCriteria);

                //lookup and verify saved correctly
                userSearchCriteria.getOredCriteria().get(0).andFirstnameEqualTo(UPDATED_USER_NAME);
                List<User> orderList = userMapper.selectByExample(userSearchCriteria);
                assertEquals("Expected order not found", 1, orderList.size());

                User updatedUser = orderList.get(0);
                assertEquals("Expected updated not detected", UPDATED_USER_NAME, updatedUser.getFirstname());
            }
        });
    }

    private void deleteAllUsers() throws IOException {
        MyBatisTransaction myBatisTransaction = new MyBatisTransaction();
        myBatisTransaction.process(myBatisTransaction.new MyBatisTransactionProcessorAdapter() {
            @Override
            public void process() throws IOException {
                UserMapper userMapper = openSQLSession().getMapper(UserMapper.class);
                //Fetch all orders
                UserExample userExample = new UserExample();
                List<User> userList = userMapper.selectByExample(userExample);
                assertTrue("Should have stored Orders", userList.size() > 0);

                //Remove all orders
                for (User user : userList) {
                    userExample.createCriteria().andUseridEqualTo(user.getUserid());
                    userMapper.deleteByExample(userExample);
                }
                userExample = new UserExample();
                userList = userMapper.selectByExample(userExample);
                assertTrue("Should have stored Orders", userList.size() == 0);
            }
        });
    }
}
