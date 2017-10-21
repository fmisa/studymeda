package api.springmvc;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import ca.studymedia.web.ClientKeys;
import ca.studymedia.web.model.SignUpModel;

@Controller
@RequestMapping(value = "/" + ClientKeys.PAGE_SIGNUP + ".*")
public class SignUpController implements ClientKeys {
	
	private static final Logger logger = LoggerFactory
			.getLogger(SignUpController.class);
	
	@RequestMapping(method = RequestMethod.POST)
	public String post(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute(MODEL_SIGNUP) @Valid SignUpModel signUpModel,
			BindingResult result, SessionStatus status) throws IOException {
		boolean success = false;
		String returnAction = null;
		try {
			//Store To Database: signUpModel
			success = true;
		} catch (Exception e) {
			/*
			 * StringBuilder errorMessageBuilder = new StringBuilder(
			 * StringEscapeUtils.escapeHtml(e.getMessage()));
			 */
			StringBuilder errorMessageBuilder = new StringBuilder(
					"Error - ");
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
			returnAction = PAGE_SIGNUP;
		return returnAction;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String get(HttpServletRequest request, HttpServletResponse response,
			SignUpModel signUpModel) throws IOException {
		return PAGE_SIGNUP;
	}
}
