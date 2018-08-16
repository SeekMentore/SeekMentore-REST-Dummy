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
import javax.ws.rs.core.MediaType;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.constants.LoginConstants;
import com.constants.RestMethodConstants;
import com.constants.RestPathConstants;
import com.constants.ScopeConstants;
import com.model.components.Enquiries;
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
	
	@Path("/resetPassword")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String resetPassword (
			@FormParam("userId") final String userId,
			@FormParam("userType") final String userType,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		if("seek".equals(userId) && "admin".equals(userType)) {
			restresponse.put("success", true);
			restresponse.put("message", "Password reset successful");
		} else {
			restresponse.put("success", false);
			restresponse.put("message", "Failed to reset password");
		}
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path(REST_METHOD_NAME_TO_UPDATE_ENQUIRY_DETAILS)
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String updateEnquiryDetails (
			final Enquiries enquiryObject,
			@Context final HttpServletRequest request
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		System.out.println(enquiryObject.getEnquiryId());
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Override
	public void doSecurity(final HttpServletRequest request) {
	}
}
