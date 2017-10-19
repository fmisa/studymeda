package ca.studymedia.service.impl;

import java.util.List;

import ca.studymedia.dao.StudyMediaServiceDAO;
import ca.studymedia.model.Category;
import ca.studymedia.service.StudyMediaService;

public class StudyMediaServiceImpl implements StudyMediaService {
	
	private StudyMediaServiceDAO studyMediaServiceDAO;	

	@Override
	public List<Category> getCategories() throws Exception {
		return getStudyMediaServiceDAO().queryCategories();
	}

	public StudyMediaServiceDAO getStudyMediaServiceDAO() {
		return studyMediaServiceDAO;
	}

	public void setStudyMediaServiceDAO(StudyMediaServiceDAO studyMediaServiceDAO) {
		this.studyMediaServiceDAO = studyMediaServiceDAO;
	}
	
	
	

}
