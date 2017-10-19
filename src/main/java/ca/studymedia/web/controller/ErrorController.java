package ca.studymedia.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ca.studymedia.web.ClientKeys;

@Controller
@RequestMapping(value="/"+ClientKeys.PAGE_ERROR+".*")
public class ErrorController implements ClientKeys {

	@RequestMapping(method = RequestMethod.GET)
	public String get(
			HttpServletRequest request,
			HttpServletResponse response,
			ModelMap model) throws IOException {
		return PAGE_ERROR;
	}	
	
}
