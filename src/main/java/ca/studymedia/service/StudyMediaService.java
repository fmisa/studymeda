package ca.studymedia.service;

import java.util.List;

import ca.studymedia.model.Category;

public interface StudyMediaService {

	public List<Category> getCategories() throws Exception;
	
}
