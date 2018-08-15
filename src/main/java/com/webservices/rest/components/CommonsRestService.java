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
		if("404".equals(errorCode)) {
			restresponse.put("errorImageSrc", "/images/error/404.jpg");
			restresponse.put("errorText", "404 Error");
		} else if("500".equals(errorCode)) {
			restresponse.put("errorImageSrc", "/images/error/500.jpg");
			restresponse.put("errorText", "500 Error");
		} else {
			restresponse.put("errorImageSrc", "/images/error/unkown.jpg");
			restresponse.put("errorText", "Unknown Error");
		}
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Override
	public void doSecurity(final HttpServletRequest request) {
	}
}
