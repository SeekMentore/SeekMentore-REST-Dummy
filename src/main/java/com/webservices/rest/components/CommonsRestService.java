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

import com.constants.RestMethodConstants;
import com.constants.RestPathConstants;
import com.constants.ScopeConstants;
import com.constants.components.CommonsConstants;
import com.webservices.rest.AbstractRestWebservice;

@Component
@Scope(ScopeConstants.SCOPE_NAME_PROTOTYPE) 
@Path(RestPathConstants.REST_SERVICE_PATH_COMMONS) 
public class CommonsRestService extends AbstractRestWebservice implements RestMethodConstants, CommonsConstants {
	
	@Path("/getErrorDetails")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String getErrorDetails (
			@FormParam("errorCode") final String errorCode,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		if("101".equals(errorCode)) {
			restresponse.put("errorImageSrc", "/images/error/101.png");
			restresponse.put("errorText", "You are not allowed to access this page.");
		} else if("102".equals(errorCode)) {
			restresponse.put("errorImageSrc", "/images/error/102.jpg");
			restresponse.put("errorText", "Page under maintnance.");
		} else if("103".equals(errorCode)) {
			restresponse.put("errorImageSrc", "/images/error/103.png");
			restresponse.put("errorText", "Your user login has been blocked. Please contact administrator.");
		} else if("104".equals(errorCode)) {
			restresponse.put("errorImageSrc", "/images/error/104.jpg");
			restresponse.put("errorText", "Site is under maintnance.");
		} else if("105".equals(errorCode)) {
			restresponse.put("errorImageSrc", "/images/error/105.jpg");
			restresponse.put("errorText", "Server error occurred while processing your request.");
		} else {
			restresponse.put("errorImageSrc", "/images/error/106.gif");
			restresponse.put("errorText", "Something went wrong!!!");
		}
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Override
	public void doSecurity(final HttpServletRequest request) {
	}
}
