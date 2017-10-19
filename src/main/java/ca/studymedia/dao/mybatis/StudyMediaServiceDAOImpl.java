package ca.studymedia.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import ca.studymedia.dao.StudyMediaServiceDAO;
import ca.studymedia.model.Category;

public class StudyMediaServiceDAOImpl implements StudyMediaServiceDAO {
	
	private static final String QUERY_SELECT_CATEGORY = "ca.studymedia.dao.mybatis.xml.StudyMediaMapper.selectCategory";	

	private SqlSessionFactory sqlSessionFactory = MyBatisSqlSessionFactory.getSqlSessionFactory();
	
	@Override
	public List<Category> queryCategories() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		return sqlSession.selectList(QUERY_SELECT_CATEGORY);
	}
	
	
	
}
