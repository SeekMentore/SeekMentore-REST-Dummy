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

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.constants.RestMethodConstants;
import com.constants.ScopeConstants;
import com.model.gridcomponent.GridComponent;
import com.webservices.rest.AbstractRestWebservice;

@Component
@Scope(ScopeConstants.SCOPE_NAME_PROTOTYPE) 
@Path("/sales") 
public class SalesRestService extends AbstractRestWebservice implements RestMethodConstants {
	
	@Path("/pendingEnquiriesList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String pendingEnquiriesList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<EnquiriesTest> data = new LinkedList<EnquiriesTest>();
		data.add(new EnquiriesTest(1L));
		data.add(new EnquiriesTest(2L));
		data.add(new EnquiriesTest(3L));
		data.add(new EnquiriesTest(4L));
		data.add(new EnquiriesTest(5L));
		data.add(new EnquiriesTest(6L));
		data.add(new EnquiriesTest(7L));
		data.add(new EnquiriesTest(8L));
		data.add(new EnquiriesTest(9L));
		data.add(new EnquiriesTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/completedEnquiriesList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String completedEnquiriesList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<EnquiriesTest> data = new LinkedList<EnquiriesTest>();
		data.add(new EnquiriesTest(1L));
		data.add(new EnquiriesTest(2L));
		data.add(new EnquiriesTest(3L));
		data.add(new EnquiriesTest(4L));
		data.add(new EnquiriesTest(5L));
		data.add(new EnquiriesTest(6L));
		data.add(new EnquiriesTest(7L));
		data.add(new EnquiriesTest(8L));
		data.add(new EnquiriesTest(9L));
		data.add(new EnquiriesTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/abortedEnquiriesList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String abortedEnquiriesList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<EnquiriesTest> data = new LinkedList<EnquiriesTest>();
		data.add(new EnquiriesTest(1L));
		data.add(new EnquiriesTest(2L));
		data.add(new EnquiriesTest(3L));
		data.add(new EnquiriesTest(4L));
		data.add(new EnquiriesTest(5L));
		data.add(new EnquiriesTest(6L));
		data.add(new EnquiriesTest(7L));
		data.add(new EnquiriesTest(8L));
		data.add(new EnquiriesTest(9L));
		data.add(new EnquiriesTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/pendingEnquiryCheckDataAccess")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String pendingEnquiryCheckDataAccess (
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("allEnquiriesDataModificationAccess", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/updateEnquiryRecord")
	@Consumes({MediaType.MULTIPART_FORM_DATA})
	@POST
	public String updateEnquiryRecord (
			@FormDataParam("completeUpdatedRecord") final String completeUpdatedRecord,
			@FormDataParam("parentId") final String parentId,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("message", "Record Updated "+completeUpdatedRecord);		
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	public class EnquiriesTest {
		
		Long enquiryId;
		Long customerId;
		String customerName;
		String customerEmail;
		String customerContactNumber;
		String subject;
		String grade;
		Integer quotedClientRate ;
		Integer negotiatedRateWithClient;
		String clientNegotiationRemarks;
		String isMapped;
		Date lastActionDate;
		Long lastActionDateMillis;
		String matchStatus;
		Long tutorId;
		String tutorName;
		String tutorEmail;
		String tutorContactNumber;
		String adminRemarks;
		String locationDetails;
		String addressDetails;
		String additionalDetails;
		String whoActed;
		String preferredTeachingType;
		
		public EnquiriesTest(Long enquiryId) {
			this.enquiryId = enquiryId;
			this.customerId = enquiryId;
			this.customerName = "Test User";
			this.customerEmail = "efg@gm.com";
			this.customerContactNumber = "78965412365";
			this.subject = "01";
			this.grade = "01";
			this.quotedClientRate = 560;
			this.negotiatedRateWithClient = 540;
			this.clientNegotiationRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test";
			this.isMapped = "N";
			this.lastActionDate = new Date();
			this.lastActionDateMillis = new Date().getTime();
			this.matchStatus = "New";
			this.tutorId = enquiryId;
			this.tutorName = "Shantanu Mukherjee";
			this.tutorEmail = "abc@gm.com";
			this.tutorContactNumber = "986542365899";
			this.adminRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test";
			this.locationDetails = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test";
			this.addressDetails = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test";
			this.additionalDetails = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test";
			this.whoActed = "absd";
			this.preferredTeachingType = "01;02";
		}
	}
	
	@Path("/currentCustomerAllPendingEnquiries")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String currentCustomerAllPendingEnquiries (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<EnquiriesTest> data = new LinkedList<EnquiriesTest>();
		data.add(new EnquiriesTest(1L));
		data.add(new EnquiriesTest(2L));
		data.add(new EnquiriesTest(3L));
		data.add(new EnquiriesTest(4L));
		data.add(new EnquiriesTest(5L));
		data.add(new EnquiriesTest(6L));
		data.add(new EnquiriesTest(7L));
		data.add(new EnquiriesTest(8L));
		data.add(new EnquiriesTest(9L));
		data.add(new EnquiriesTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	

	@Override
	protected void doSecurity(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
