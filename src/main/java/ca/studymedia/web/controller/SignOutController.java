package ca.studymedia.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import ca.studymedia.web.ClientKeys;
import ca.studymedia.web.model.SignInModel;

@Controller
@RequestMapping(value = "/" + ClientKeys.PAGE_SIGNOUT + ".*")
public class SignOutController implements ClientKeys {

	private static final Logger logger = LoggerFactory
			.getLogger(SignOutController.class);

	@RequestMapping(method = RequestMethod.POST)
	public String post(
			HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute(MODEL_USER) @Valid SignInModel signInControllerModel,
			BindingResult result, SessionStatus status) {
		status.setComplete();
		SecurityUtils.getSubject().logout();
		return PAGE_LANDING;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String get(HttpServletRequest request, HttpServletResponse response,
			SignInModel signInControllerModel) {
		SecurityUtils.getSubject().logout();
		return PAGE_LANDING;
	}
}
