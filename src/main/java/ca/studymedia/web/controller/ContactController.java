package ca.studymedia.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {

	@RequestMapping("/contact.*")
	public String redirect() {
		return "contact";
	}
}
