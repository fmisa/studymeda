package ca.studymedia.web.filter;

import javax.servlet.ServletRequest;

import org.apache.shiro.authc.AuthenticationException;

import ca.studymedia.web.ClientKeys;

public class FormAuthenticationFilter extends
		org.apache.shiro.web.filter.authc.FormAuthenticationFilter {

	@Override
	protected void setFailureAttribute(ServletRequest request,
			AuthenticationException ae) {
		String message = ae.getMessage();
		request.setAttribute(ClientKeys.KEY_ERROR_MESSAGE, message);
	}

}
