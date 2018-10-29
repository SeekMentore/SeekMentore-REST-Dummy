package com.webservices.rest.components;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.constants.RestMethodConstants;
import com.constants.ScopeConstants;
import com.model.gridcomponent.GridComponent;
import com.webservices.rest.AbstractRestWebservice;

@Component
@Scope(ScopeConstants.SCOPE_NAME_PROTOTYPE) 
@Path("/subscribedCustomer") 
public class SubscribedCustomerRestService extends AbstractRestWebservice implements RestMethodConstants {
	
	
	@Path("/currentPackages")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String currentPackages (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<SubscriptionPackage1> data = new LinkedList<SubscriptionPackage1>();
		data.add(new SubscriptionPackage1(1L));
		data.add(new SubscriptionPackage1(2L));
		data.add(new SubscriptionPackage1(3L));
		data.add(new SubscriptionPackage1(4L));
		data.add(new SubscriptionPackage1(5L));
		data.add(new SubscriptionPackage1(6L));
		data.add(new SubscriptionPackage1(7L));
		data.add(new SubscriptionPackage1(8L));
		data.add(new SubscriptionPackage1(9L));
		data.add(new SubscriptionPackage1(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/historyPackages")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String historyPackages (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<SubscriptionPackage1> data = new LinkedList<SubscriptionPackage1>();
		data.add(new SubscriptionPackage1(1L));
		data.add(new SubscriptionPackage1(2L));
		data.add(new SubscriptionPackage1(3L));
		data.add(new SubscriptionPackage1(4L));
		data.add(new SubscriptionPackage1(5L));
		data.add(new SubscriptionPackage1(6L));
		data.add(new SubscriptionPackage1(7L));
		data.add(new SubscriptionPackage1(8L));
		data.add(new SubscriptionPackage1(9L));
		data.add(new SubscriptionPackage1(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	class SubscriptionPackage1 {
		 Long subscriptionPackageId;
		 String customerName;
		 Integer totalHours;
		 Date startDate;
		 Long startDateMillis;
		 Integer completedHours;
		 Date endDate;
		 Long endDateMillis;
		
		 SubscriptionPackage1(Long subscriptionPackageId) {
			this.subscriptionPackageId = subscriptionPackageId;
			customerName = "Parag Agarwal";
			totalHours = 25;
			startDate = new Date();
			startDateMillis = startDate.getTime();
			completedHours = 23;
			endDate = new Date();
			endDateMillis = endDate.getTime();
		}
	}

	@Override
	protected void doSecurity(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
