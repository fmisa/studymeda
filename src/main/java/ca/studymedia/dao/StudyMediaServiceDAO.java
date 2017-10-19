package ca.studymedia.dao;

import java.util.List;

import ca.studymedia.model.Category;

public interface StudyMediaServiceDAO {

	public List<Category> queryCategories() throws Exception;

}
