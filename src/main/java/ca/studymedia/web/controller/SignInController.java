package ca.studymedia.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.Validator;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import ca.studymedia.web.ClientKeys;
import ca.studymedia.web.model.SignInModel;

@Controller
@RequestMapping(value = "/" + ClientKeys.PAGE_SIGNIN + ".*")
public class SignInController implements ClientKeys {

	private static final Logger logger = LoggerFactory
			.getLogger(SignInController.class);

	@Autowired
	private Validator validator;

	public SignInController() {
		super();
	}

	public SignInController(Validator validator) {
		this();
		this.validator = validator;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String post(
			HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute(MODEL_USER) @Valid SignInModel signInControllerModel,
			BindingResult result, SessionStatus status) throws IOException {
		boolean success = false;
		String returnAction = null;
		try {
			UsernamePasswordToken token = new UsernamePasswordToken(
					signInControllerModel.getUsername(),
					signInControllerModel.getPassword());
			SecurityUtils.getSubject().login(token);
			success = true;
		} catch (AuthenticationException e) {
			/*StringBuilder errorMessageBuilder = new StringBuilder(
					StringEscapeUtils.escapeHtml(e.getMessage()));*/
			StringBuilder errorMessageBuilder = new StringBuilder("Authentication Error - ");
			errorMessageBuilder.append(" User: ");
			errorMessageBuilder.append(signInControllerModel.getUsername());
			errorMessageBuilder.append(" Password: ");
			errorMessageBuilder.append(signInControllerModel.getPassword());
			errorMessageBuilder.append(" Please Try Again: ");
			request.setAttribute(KEY_ERROR_MESSAGE,
					errorMessageBuilder.toString());
			logger.info(errorMessageBuilder.toString(), e);
		} finally {
			status.setComplete();
		}
		if (success)
			WebUtils.redirectToSavedRequest(request, response, PAGE_LANDING
					+ PAGE_DEFAULT_EXTENSION);
		else
			returnAction = PAGE_SIGNIN;
		return returnAction;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String get(HttpServletRequest request, HttpServletResponse response,
			SignInModel signInControllerModel) throws IOException {
		if (SecurityUtils.getSubject().isAuthenticated()) {
			WebUtils.redirectToSavedRequest(request, response, PAGE_LANDING
					+ PAGE_DEFAULT_EXTENSION);
			return null;
		} else {
			return PAGE_SIGNIN;
		}
	}

}
