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
@Path("/support") 
public class SupportRestService extends AbstractRestWebservice implements RestMethodConstants {
	
	@Path("/nonContactedBecomeTutorsList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String nonContactedBecomeTutorsList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<BecomeTutorTest> data = new LinkedList<BecomeTutorTest>();
		data.add(new BecomeTutorTest(1L));
		data.add(new BecomeTutorTest(2L));
		data.add(new BecomeTutorTest(3L));
		data.add(new BecomeTutorTest(4L));
		data.add(new BecomeTutorTest(5L));
		data.add(new BecomeTutorTest(6L));
		data.add(new BecomeTutorTest(7L));
		data.add(new BecomeTutorTest(8L));
		data.add(new BecomeTutorTest(9L));
		data.add(new BecomeTutorTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/nonVerifiedBecomeTutorsList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String nonVerifiedBecomeTutorsList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<BecomeTutorTest> data = new LinkedList<BecomeTutorTest>();
		data.add(new BecomeTutorTest(1L));
		data.add(new BecomeTutorTest(2L));
		data.add(new BecomeTutorTest(3L));
		data.add(new BecomeTutorTest(4L));
		data.add(new BecomeTutorTest(5L));
		data.add(new BecomeTutorTest(6L));
		data.add(new BecomeTutorTest(7L));
		data.add(new BecomeTutorTest(8L));
		data.add(new BecomeTutorTest(9L));
		data.add(new BecomeTutorTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/verifiedBecomeTutorsList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String verifiedBecomeTutorsList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<BecomeTutorTest> data = new LinkedList<BecomeTutorTest>();
		data.add(new BecomeTutorTest(1L));
		data.add(new BecomeTutorTest(2L));
		data.add(new BecomeTutorTest(3L));
		data.add(new BecomeTutorTest(4L));
		data.add(new BecomeTutorTest(5L));
		data.add(new BecomeTutorTest(6L));
		data.add(new BecomeTutorTest(7L));
		data.add(new BecomeTutorTest(8L));
		data.add(new BecomeTutorTest(9L));
		data.add(new BecomeTutorTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/verificationFailedBecomeTutorsList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String verificationFailedBecomeTutorsList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<BecomeTutorTest> data = new LinkedList<BecomeTutorTest>();
		data.add(new BecomeTutorTest(1L));
		data.add(new BecomeTutorTest(2L));
		data.add(new BecomeTutorTest(3L));
		data.add(new BecomeTutorTest(4L));
		data.add(new BecomeTutorTest(5L));
		data.add(new BecomeTutorTest(6L));
		data.add(new BecomeTutorTest(7L));
		data.add(new BecomeTutorTest(8L));
		data.add(new BecomeTutorTest(9L));
		data.add(new BecomeTutorTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/toBeReContactedBecomeTutorsList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String toBeReContactedBecomeTutorsList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<BecomeTutorTest> data = new LinkedList<BecomeTutorTest>();
		data.add(new BecomeTutorTest(1L));
		data.add(new BecomeTutorTest(2L));
		data.add(new BecomeTutorTest(3L));
		data.add(new BecomeTutorTest(4L));
		data.add(new BecomeTutorTest(5L));
		data.add(new BecomeTutorTest(6L));
		data.add(new BecomeTutorTest(7L));
		data.add(new BecomeTutorTest(8L));
		data.add(new BecomeTutorTest(9L));
		data.add(new BecomeTutorTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/selectedBecomeTutorsList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String selectedBecomeTutorsList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<BecomeTutorTest> data = new LinkedList<BecomeTutorTest>();
		data.add(new BecomeTutorTest(1L));
		data.add(new BecomeTutorTest(2L));
		data.add(new BecomeTutorTest(3L));
		data.add(new BecomeTutorTest(4L));
		data.add(new BecomeTutorTest(5L));
		data.add(new BecomeTutorTest(6L));
		data.add(new BecomeTutorTest(7L));
		data.add(new BecomeTutorTest(8L));
		data.add(new BecomeTutorTest(9L));
		data.add(new BecomeTutorTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/rejectedBecomeTutorsList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String rejectedBecomeTutorsList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<BecomeTutorTest> data = new LinkedList<BecomeTutorTest>();
		data.add(new BecomeTutorTest(1L));
		data.add(new BecomeTutorTest(2L));
		data.add(new BecomeTutorTest(3L));
		data.add(new BecomeTutorTest(4L));
		data.add(new BecomeTutorTest(5L));
		data.add(new BecomeTutorTest(6L));
		data.add(new BecomeTutorTest(7L));
		data.add(new BecomeTutorTest(8L));
		data.add(new BecomeTutorTest(9L));
		data.add(new BecomeTutorTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/registeredBecomeTutorsList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String registeredBecomeTutorsList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<BecomeTutorTest> data = new LinkedList<BecomeTutorTest>();
		data.add(new BecomeTutorTest(1L));
		data.add(new BecomeTutorTest(2L));
		data.add(new BecomeTutorTest(3L));
		data.add(new BecomeTutorTest(4L));
		data.add(new BecomeTutorTest(5L));
		data.add(new BecomeTutorTest(6L));
		data.add(new BecomeTutorTest(7L));
		data.add(new BecomeTutorTest(8L));
		data.add(new BecomeTutorTest(9L));
		data.add(new BecomeTutorTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	public class BecomeTutorTest {
		
		Long tentativeTutorId;
		Date applicationDate;
		Long applicationDateMillis;
		String applicationStatus;
		Date dateOfBirth;
		Long dateOfBirthMillis;
		String contactNumber;
		String emailId;
		String firstName;
		String lastName;
		String gender;
		String qualification;
		String primaryProfession;
		String transportMode;
		Integer teachingExp;
		String studentGrade;
		String subjects;
		String locations;
		String preferredTimeToCall;
		String additionalDetails;
		String isContacted;
		String whoContacted;
		Date contactedDate;
		Long contactedDateMillis;
		String contactedRemarks;
		String isAuthenticationVerified;
		String whoVerified;
		Date verificationDate;
		Long verificationDateMillis;
		String verificationRemarks;
		String isToBeRecontacted;
		String whoSuggestedForRecontact;
		Date suggestionDate;
		Long suggestionDateMillis;
		String suggestionRemarks;
		String whoRecontacted;
		Date recontactedDate;
		Long recontactedDateMillis;
		String recontactedRemarks;
		String isSelected;
		String whoSelected;
		Date selectionDate;
		Long selectionDateMillis;
		String selectionRemarks;
		String isRejected;
		String whoRejected;
		Date rejectionDate;
		Long rejectionDateMillis;
		String rejectionRemarks;
		Integer rejectionCount;
		String reference;
		String preferredTeachingType;
		String reApplied;
		Date previousApplicationDate;
		Long previousApplicationDateMillis;
		Date recordLastUpdated;
		Long recordLastUpdatedMillis;
		
		public BecomeTutorTest(Long tentativeTutorId) {
			this.tentativeTutorId = tentativeTutorId;
			this.applicationDate = new Date();
			this.applicationDateMillis = new Date().getTime();
			this.applicationStatus = "FRESH";
			this.dateOfBirth = new Date();
			this.dateOfBirthMillis = new Date().getTime();
			this.contactNumber = "989898989898";
			this.emailId = "abc@efb.com";
			this.firstName = "Shantanu";
			this.lastName = "Mukherjee";
			this.gender = "01";
			this.qualification = "02";
			this.primaryProfession = "03";
			this.transportMode = "02";
			this.teachingExp = 5;
			this.studentGrade = "01;02;03";
			this.subjects = "01;02;03";
			this.locations = "01;02;03";
			this.preferredTimeToCall = "01;02;03";
			this.additionalDetails = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.isContacted = "Y";
			this.whoContacted = "abc";
			this.contactedDate = new Date();
			this.contactedDateMillis = new Date().getTime();
			this.contactedRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.isAuthenticationVerified = "Y";
			this.whoVerified = "abc";
			this.verificationDate = new Date();
			this.verificationDateMillis = new Date().getTime();
			this.verificationRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.isToBeRecontacted = "N";
			this.whoSuggestedForRecontact = "abc";
			this.suggestionDate = new Date();
			this.suggestionDateMillis = new Date().getTime();
			this.suggestionRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.whoRecontacted = "abc";
			this.recontactedDate = new Date();
			this.recontactedDateMillis = new Date().getTime();
			this.recontactedRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.isSelected = "Y";
			this.whoSelected = "abc";
			this.selectionDate = new Date();
			this.selectionDateMillis = new Date().getTime();
			this.selectionRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.isRejected = "Y";
			this.whoRejected = "abc";
			this.rejectionDate = new Date();
			this.rejectionDateMillis = new Date().getTime();
			this.rejectionRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.rejectionCount = 2;
			this.reApplied = "Y";
			this.reference = "02";
			this.preferredTeachingType = "01;02";
			this.previousApplicationDate = new Date();
			this.previousApplicationDateMillis = new Date().getTime();
			this.recordLastUpdated = new Date();
			this.recordLastUpdatedMillis = new Date().getTime();
		}
	}
	
	@Path("/nonContactedEnquirysList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String nonContactedEnquirysList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<FindTutorTest> data = new LinkedList<FindTutorTest>();
		data.add(new FindTutorTest(1L));
		data.add(new FindTutorTest(2L));
		data.add(new FindTutorTest(3L));
		data.add(new FindTutorTest(4L));
		data.add(new FindTutorTest(5L));
		data.add(new FindTutorTest(6L));
		data.add(new FindTutorTest(7L));
		data.add(new FindTutorTest(8L));
		data.add(new FindTutorTest(9L));
		data.add(new FindTutorTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/nonVerifiedEnquirysList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String nonVerifiedEnquirysList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<FindTutorTest> data = new LinkedList<FindTutorTest>();
		data.add(new FindTutorTest(1L));
		data.add(new FindTutorTest(2L));
		data.add(new FindTutorTest(3L));
		data.add(new FindTutorTest(4L));
		data.add(new FindTutorTest(5L));
		data.add(new FindTutorTest(6L));
		data.add(new FindTutorTest(7L));
		data.add(new FindTutorTest(8L));
		data.add(new FindTutorTest(9L));
		data.add(new FindTutorTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/verifiedEnquirysList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String verifiedEnquirysList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<FindTutorTest> data = new LinkedList<FindTutorTest>();
		data.add(new FindTutorTest(1L));
		data.add(new FindTutorTest(2L));
		data.add(new FindTutorTest(3L));
		data.add(new FindTutorTest(4L));
		data.add(new FindTutorTest(5L));
		data.add(new FindTutorTest(6L));
		data.add(new FindTutorTest(7L));
		data.add(new FindTutorTest(8L));
		data.add(new FindTutorTest(9L));
		data.add(new FindTutorTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/verificationFailedEnquirysList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String verificationFailedEnquirysList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<FindTutorTest> data = new LinkedList<FindTutorTest>();
		data.add(new FindTutorTest(1L));
		data.add(new FindTutorTest(2L));
		data.add(new FindTutorTest(3L));
		data.add(new FindTutorTest(4L));
		data.add(new FindTutorTest(5L));
		data.add(new FindTutorTest(6L));
		data.add(new FindTutorTest(7L));
		data.add(new FindTutorTest(8L));
		data.add(new FindTutorTest(9L));
		data.add(new FindTutorTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/toBeReContactedEnquirysList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String toBeReContactedEnquirysList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<FindTutorTest> data = new LinkedList<FindTutorTest>();
		data.add(new FindTutorTest(1L));
		data.add(new FindTutorTest(2L));
		data.add(new FindTutorTest(3L));
		data.add(new FindTutorTest(4L));
		data.add(new FindTutorTest(5L));
		data.add(new FindTutorTest(6L));
		data.add(new FindTutorTest(7L));
		data.add(new FindTutorTest(8L));
		data.add(new FindTutorTest(9L));
		data.add(new FindTutorTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/selectedEnquirysList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String selectedEnquirysList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<FindTutorTest> data = new LinkedList<FindTutorTest>();
		data.add(new FindTutorTest(1L));
		data.add(new FindTutorTest(2L));
		data.add(new FindTutorTest(3L));
		data.add(new FindTutorTest(4L));
		data.add(new FindTutorTest(5L));
		data.add(new FindTutorTest(6L));
		data.add(new FindTutorTest(7L));
		data.add(new FindTutorTest(8L));
		data.add(new FindTutorTest(9L));
		data.add(new FindTutorTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/rejectedEnquirysList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String rejectedEnquirysList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<FindTutorTest> data = new LinkedList<FindTutorTest>();
		data.add(new FindTutorTest(1L));
		data.add(new FindTutorTest(2L));
		data.add(new FindTutorTest(3L));
		data.add(new FindTutorTest(4L));
		data.add(new FindTutorTest(5L));
		data.add(new FindTutorTest(6L));
		data.add(new FindTutorTest(7L));
		data.add(new FindTutorTest(8L));
		data.add(new FindTutorTest(9L));
		data.add(new FindTutorTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}	
	
	public class FindTutorTest {
		
		Long enquiryId;
		Date enquiryDate;
		Long enquiryDateMillis;
		String enquiryStatus;
		String name;
		String contactNumber;
		String emailId;
		String studentGrade;
		String subjects;
		String preferredTimeToCall;
		String additionalDetails;
		String subscribedCustomer;
		String isContacted;
		String whoContacted;
		Date contactedDate;
		Long contactedDateMillis;
		String contactedRemarks;
		String isAuthenticationVerified;
		String whoVerified;
		Date verificationDate;
		Long verificationDateMillis;
		String verificationRemarks;
		String isToBeRecontacted;
		String whoSuggestedForRecontact;
		Date suggestionDate;
		Long suggestionDateMillis;
		String suggestionRemarks;
		String whoRecontacted;
		Date recontactedDate;
		Long recontactedDateMillis;
		String recontactedRemarks;
		String isSelected;
		String whoSelected;
		Date selectionDate;
		Long selectionDateMillis;
		String selectionRemarks;
		String isRejected;
		String whoRejected;
		Date rejectionDate;
		Long rejectionDateMillis;
		String rejectionRemarks;
		String location;
		String reference;
		String addressDetails;
		Date recordLastUpdated;
		Long recordLastUpdatedMillis;
		
		public FindTutorTest(Long enquiryId) {
			this.enquiryId = enquiryId;
			this.enquiryDate = new Date();
			this.enquiryDateMillis = new Date().getTime();
			this.enquiryStatus = "FRESH";
			this.name = "Shantanu Mukherjee";
			this.contactNumber = "989898989898";
			this.emailId = "abc@efb.com";
			this.studentGrade = "01";
			this.subjects = "01";
			this.preferredTimeToCall = "01;02;03";
			this.additionalDetails = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.isContacted = "Y";
			this.whoContacted = "abc";
			this.contactedDate = new Date();
			this.contactedDateMillis = new Date().getTime();
			this.contactedRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.isAuthenticationVerified = "Y";
			this.whoVerified = "abc";
			this.verificationDate = new Date();
			this.verificationDateMillis = new Date().getTime();
			this.verificationRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.isToBeRecontacted = "Y";
			this.whoSuggestedForRecontact = "abc";
			this.suggestionDate = new Date();
			this.suggestionDateMillis = new Date().getTime();
			this.suggestionRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.whoRecontacted = "abc";
			this.recontactedDate = new Date();
			this.recontactedDateMillis = new Date().getTime();
			this.recontactedRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.isSelected = "Y";
			this.whoSelected = "abc";
			this.selectionDate = new Date();
			this.selectionDateMillis = new Date().getTime();
			this.selectionRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.isRejected = "Y";
			this.whoRejected = "abc";
			this.rejectionDate = new Date();
			this.rejectionDateMillis = new Date().getTime();
			this.rejectionRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.recordLastUpdated = new Date();
			this.recordLastUpdatedMillis = new Date().getTime();
			this.location = "01";
			this.reference = "01";
			this.addressDetails = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
		}
	}
	
	@Path("/nonContactedSubscriptionsList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String nonContactedSubscriptionsList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<SubscribeWithUsTest> data = new LinkedList<SubscribeWithUsTest>();
		data.add(new SubscribeWithUsTest(1L));
		data.add(new SubscribeWithUsTest(2L));
		data.add(new SubscribeWithUsTest(3L));
		data.add(new SubscribeWithUsTest(4L));
		data.add(new SubscribeWithUsTest(5L));
		data.add(new SubscribeWithUsTest(6L));
		data.add(new SubscribeWithUsTest(7L));
		data.add(new SubscribeWithUsTest(8L));
		data.add(new SubscribeWithUsTest(9L));
		data.add(new SubscribeWithUsTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}	
	
	@Path("/nonVerifiedSubscriptionsList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String nonVerifiedSubscriptionsList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<SubscribeWithUsTest> data = new LinkedList<SubscribeWithUsTest>();
		data.add(new SubscribeWithUsTest(1L));
		data.add(new SubscribeWithUsTest(2L));
		data.add(new SubscribeWithUsTest(3L));
		data.add(new SubscribeWithUsTest(4L));
		data.add(new SubscribeWithUsTest(5L));
		data.add(new SubscribeWithUsTest(6L));
		data.add(new SubscribeWithUsTest(7L));
		data.add(new SubscribeWithUsTest(8L));
		data.add(new SubscribeWithUsTest(9L));
		data.add(new SubscribeWithUsTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}	
	
	@Path("/verifiedSubscriptionsList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String verifiedSubscriptionsList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<SubscribeWithUsTest> data = new LinkedList<SubscribeWithUsTest>();
		data.add(new SubscribeWithUsTest(1L));
		data.add(new SubscribeWithUsTest(2L));
		data.add(new SubscribeWithUsTest(3L));
		data.add(new SubscribeWithUsTest(4L));
		data.add(new SubscribeWithUsTest(5L));
		data.add(new SubscribeWithUsTest(6L));
		data.add(new SubscribeWithUsTest(7L));
		data.add(new SubscribeWithUsTest(8L));
		data.add(new SubscribeWithUsTest(9L));
		data.add(new SubscribeWithUsTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}	
	
	@Path("/verificationFailedSubscriptionsList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String verificationFailedSubscriptionsList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<SubscribeWithUsTest> data = new LinkedList<SubscribeWithUsTest>();
		data.add(new SubscribeWithUsTest(1L));
		data.add(new SubscribeWithUsTest(2L));
		data.add(new SubscribeWithUsTest(3L));
		data.add(new SubscribeWithUsTest(4L));
		data.add(new SubscribeWithUsTest(5L));
		data.add(new SubscribeWithUsTest(6L));
		data.add(new SubscribeWithUsTest(7L));
		data.add(new SubscribeWithUsTest(8L));
		data.add(new SubscribeWithUsTest(9L));
		data.add(new SubscribeWithUsTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}	
	
	@Path("/toBeReContactedSubscriptionsList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String toBeReContactedSubscriptionsList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<SubscribeWithUsTest> data = new LinkedList<SubscribeWithUsTest>();
		data.add(new SubscribeWithUsTest(1L));
		data.add(new SubscribeWithUsTest(2L));
		data.add(new SubscribeWithUsTest(3L));
		data.add(new SubscribeWithUsTest(4L));
		data.add(new SubscribeWithUsTest(5L));
		data.add(new SubscribeWithUsTest(6L));
		data.add(new SubscribeWithUsTest(7L));
		data.add(new SubscribeWithUsTest(8L));
		data.add(new SubscribeWithUsTest(9L));
		data.add(new SubscribeWithUsTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}	
	
	@Path("/selectedSubscriptionsList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String selectedSubscriptionsList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<SubscribeWithUsTest> data = new LinkedList<SubscribeWithUsTest>();
		data.add(new SubscribeWithUsTest(1L));
		data.add(new SubscribeWithUsTest(2L));
		data.add(new SubscribeWithUsTest(3L));
		data.add(new SubscribeWithUsTest(4L));
		data.add(new SubscribeWithUsTest(5L));
		data.add(new SubscribeWithUsTest(6L));
		data.add(new SubscribeWithUsTest(7L));
		data.add(new SubscribeWithUsTest(8L));
		data.add(new SubscribeWithUsTest(9L));
		data.add(new SubscribeWithUsTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}	
	
	@Path("/rejectedSubscriptionsList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String rejectedSubscriptionsList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<SubscribeWithUsTest> data = new LinkedList<SubscribeWithUsTest>();
		data.add(new SubscribeWithUsTest(1L));
		data.add(new SubscribeWithUsTest(2L));
		data.add(new SubscribeWithUsTest(3L));
		data.add(new SubscribeWithUsTest(4L));
		data.add(new SubscribeWithUsTest(5L));
		data.add(new SubscribeWithUsTest(6L));
		data.add(new SubscribeWithUsTest(7L));
		data.add(new SubscribeWithUsTest(8L));
		data.add(new SubscribeWithUsTest(9L));
		data.add(new SubscribeWithUsTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}	
	
	public class SubscribeWithUsTest {
		
		Long tentativeSubscriptionId;
		Date applicationDate;
		Long applicationDateMillis;
		String applicationStatus;
		String firstName;
		String lastName;
		String contactNumber;
		String emailId;
		String studentGrade;
		String subjects;
		String preferredTimeToCall;
		String additionalDetails;
		String subscribedCustomer;
		String isContacted;
		String whoContacted;
		Date contactedDate;
		Long contactedDateMillis;
		String contactedRemarks;
		String isAuthenticationVerified;
		String whoVerified;
		Date verificationDate;
		Long verificationDateMillis;
		String verificationRemarks;
		String isToBeRecontacted;
		String whoSuggestedForRecontact;
		Date suggestionDate;
		Long suggestionDateMillis;
		String suggestionRemarks;
		String whoRecontacted;
		Date recontactedDate;
		Long recontactedDateMillis;
		String recontactedRemarks;
		String isSelected;
		String whoSelected;
		Date selectionDate;
		Long selectionDateMillis;
		String selectionRemarks;
		String isRejected;
		String whoRejected;
		Date rejectionDate;
		Long rejectionDateMillis;
		String rejectionRemarks;
		String location;
		String reference;
		String addressDetails;
		Date recordLastUpdated;
		Long recordLastUpdatedMillis;
		
		public SubscribeWithUsTest(Long tentativeSubscriptionId) {
			this.tentativeSubscriptionId = tentativeSubscriptionId;
			this.applicationDate = new Date();
			this.applicationDateMillis = new Date().getTime();
			this.applicationStatus = "FRESH";
			this.firstName = "Shantanu";
			this.lastName = "Mukherjee";
			this.contactNumber = "989898989898";
			this.emailId = "abc@efb.com";
			this.studentGrade = "01;02;03";
			this.subjects = "01;02;03";
			this.preferredTimeToCall = "01;02;03";
			this.additionalDetails = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.isContacted = "Y";
			this.whoContacted = "abc";
			this.contactedDate = new Date();
			this.contactedDateMillis = new Date().getTime();
			this.contactedRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.isAuthenticationVerified = "Y";
			this.whoVerified = "abc";
			this.verificationDate = new Date();
			this.verificationDateMillis = new Date().getTime();
			this.verificationRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.isToBeRecontacted = "Y";
			this.whoSuggestedForRecontact = "abc";
			this.suggestionDate = new Date();
			this.suggestionDateMillis = new Date().getTime();
			this.suggestionRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.whoRecontacted = "abc";
			this.recontactedDate = new Date();
			this.recontactedDateMillis = new Date().getTime();
			this.recontactedRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.isSelected = "Y";
			this.whoSelected = "abc";
			this.selectionDate = new Date();
			this.selectionDateMillis = new Date().getTime();
			this.selectionRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.isRejected = "Y";
			this.whoRejected = "abc";
			this.rejectionDate = new Date();
			this.rejectionDateMillis = new Date().getTime();
			this.rejectionRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.location = "01";
			this.reference = "01";
			this.addressDetails = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
			this.recordLastUpdated = new Date();
			this.recordLastUpdatedMillis = new Date().getTime();
			
		}
	}

	@Override
	protected void doSecurity(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
