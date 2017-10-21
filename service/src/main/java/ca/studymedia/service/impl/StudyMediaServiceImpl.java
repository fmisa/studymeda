package ca.studymedia.service.impl;

import java.io.IOException;
import java.util.List;

import ca.studymedia.dao.mybatis.example.CategoryExample;
import ca.studymedia.dao.mybatis.mapper.CategoryMapper;
import ca.studymedia.dao.mybatis.transaction.MyBatisTransaction;
import ca.studymedia.service.StudyMediaService;

public class StudyMediaServiceImpl implements StudyMediaService {

	@Override
	public List getCategories() throws Exception {
        MyBatisTransaction myBatisTransaction = new MyBatisTransaction();
        return myBatisTransaction.processList(myBatisTransaction.new MyBatisTransactionProcessorAdapter() {
            @Override
            public List processList() throws IOException {
                CategoryExample categoryExample = new CategoryExample();
                CategoryMapper categoryMapper = openSQLSession().getMapper(CategoryMapper.class);
                return categoryMapper.selectByExample(categoryExample);
            }
        });
	}
}
