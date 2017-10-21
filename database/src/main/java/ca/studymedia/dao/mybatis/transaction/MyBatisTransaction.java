package ca.studymedia.dao.mybatis.transaction;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTransaction {

    private SqlSession sqlSession;
    private SqlSessionFactory sqlSessionFactory;

    public void process(MyBatisTransactionProcessor transactionProcessor) throws IOException {
        try {
            transactionProcessor.processInt();
            getSqlSession().commit();
        } finally {
            getSqlSession().close();
        }
    }

    public int processInt(MyBatisTransactionProcessor transactionProcessor) throws IOException {
        try {
            int returnValue = transactionProcessor.processInt();
            getSqlSession().commit();
            return returnValue;
        } finally {
            getSqlSession().close();
        }
    }

    public long processLong(MyBatisTransactionProcessor transactionProcessor) throws IOException {
        try {
            long returnValue = transactionProcessor.processLong();
            getSqlSession().commit();
            return returnValue;
        } finally {
            getSqlSession().close();
        }
    }

    public List<Object> processList(MyBatisTransactionProcessor transactionProcessor) throws IOException {
        try {
            List<Object> returnValue = transactionProcessor.processList();
            getSqlSession().commit();
            return returnValue;
        } finally {
            getSqlSession().close();
        }
    }

    private SqlSessionFactory getSqlSessionFactory() throws IOException {
        if (sqlSessionFactory == null) {
            String resource = "mybatis/config/mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }
        return sqlSessionFactory;
    }

    private SqlSession getSqlSession() throws IOException {
        if (sqlSession == null) {
            sqlSession = getSqlSessionFactory().openSession();
        }
        return sqlSession;
    }

    public abstract class MyBatisTransactionProcessor {
        public abstract void process() throws IOException;
        public abstract int processInt() throws IOException;
        public abstract long processLong() throws IOException;
        public abstract List<Object> processList() throws IOException;
        public SqlSession openSQLSession() throws IOException {
            return getSqlSession();
        }
    }

    public class MyBatisTransactionProcessorAdapter extends MyBatisTransactionProcessor {
        @Override
        public void process() throws IOException {
            return;
        }

        @Override
        public int processInt() throws IOException {
            return 0;
        }

        @Override
        public long processLong() throws IOException {
            return 0;
        }

        @Override
        public List<Object> processList() throws IOException {
            return null;
        }
    }
}
