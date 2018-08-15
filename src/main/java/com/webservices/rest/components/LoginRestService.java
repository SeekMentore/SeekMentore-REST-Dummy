package com.webservices.rest.components;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.constants.LoginConstants;
import com.constants.RestMethodConstants;
import com.constants.RestPathConstants;
import com.constants.ScopeConstants;
import com.utils.LoginUtils;
import com.utils.WebServiceUtils;
import com.webservices.rest.AbstractRestWebservice;

@Component
@Scope(ScopeConstants.SCOPE_NAME_PROTOTYPE) 
@Path(RestPathConstants.REST_SERVICE_PATH_LOGIN) 
public class LoginRestService extends AbstractRestWebservice implements RestMethodConstants, LoginConstants {
	
	@Path(REST_METHOD_NAME_TO_VALIDATE_CREDENTIAL)
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String validateCredential (
			@FormParam("userId") final String userId,
			@FormParam("password") final String password,
			@FormParam("userType") final String userType,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		if("seek".equals(userId) && "mentore".equals(password) && "admin".equals(userType)) {
			restresponse.put("success", true);
			restresponse.put("redirectTo", "/newUrl");
		} else {
			restresponse.put("success", false);
			restresponse.put("message", "This is the Failure message");
		}
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path(REST_METHOD_NAME_TO_LOGOUT)
	@POST
	public void logout (
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		this.methodName = REST_METHOD_NAME_TO_LOGOUT;
		doSecurity(request);
		if (this.securityPassed) {
			LoginUtils.logoutUserSession(request);
			WebServiceUtils.redirectToPage("/login.html", request, response);
		}
	}
	
	@Override
	public void doSecurity(final HttpServletRequest request) {
	}
}
