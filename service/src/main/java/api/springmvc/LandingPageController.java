package api.springmvc;

import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ca.studymedia.service.StudyMediaService;

@Controller
public class LandingPageController {

	@Autowired
	private StudyMediaService studyMediaService;
	
	@RequestMapping("/landingPage.*")
	public String redirect() {
		return "landingPage";
	}
}
