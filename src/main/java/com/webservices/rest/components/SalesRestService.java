package com.webservices.rest.components;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.constants.RestMethodConstants;
import com.constants.ScopeConstants;
import com.model.components.TutorDocument;
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
			this.locationDetails = "01";
			this.addressDetails = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test";
			this.additionalDetails = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test";
			this.whoActed = "absd";
			this.preferredTeachingType = "01;02";
		}
	}
	
	@Path("/currentCustomerAllPendingEnquiriesList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String currentCustomerAllPendingEnquiriesList (
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
	
	@Path("/toBeMappedEnquiriesGridList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String toBeMappedEnquiriesGridList (
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
	
	@Path("/mapTutorToEnquiryCheckDataAccess")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String mapTutorToEnquiryCheckDataAccess (
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("enquiryMappingAccess", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/allMappingEligibleTutorsList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String allMappingEligibleTutorsList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<RegisteredTutorTest> data = new LinkedList<RegisteredTutorTest>();
		data.add(new RegisteredTutorTest(1L));
		data.add(new RegisteredTutorTest(2L));
		data.add(new RegisteredTutorTest(3L));
		data.add(new RegisteredTutorTest(4L));
		data.add(new RegisteredTutorTest(5L));
		data.add(new RegisteredTutorTest(6L));
		data.add(new RegisteredTutorTest(7L));
		data.add(new RegisteredTutorTest(8L));
		data.add(new RegisteredTutorTest(9L));
		data.add(new RegisteredTutorTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/mapRegisteredTutors")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String mapRegisteredTutors (
			@FormParam("enquiryId") final String enquiryId,
			@FormParam("allIdsList") final String allIdsList,
			@FormParam("comments") final String comments,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("message", "All Ids blacklisted "+allIdsList+" "+comments);		
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/mapRegisteredTutor")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String mapRegisteredTutor (
			@FormParam("enquiryId") final String enquiryId,
			@FormParam("tutorId") final String tutorId,
			@FormParam("comments") final String comments,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("message", "All Ids mapped "+tutorId+" "+comments);		
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	class RegisteredTutorTest {
		 Long tutorId;
		 String name;
		 String contactNumber;
		 String emailId;
		 Long tentativeTutorId;
		 Date dateOfBirth;
		 String gender;
		 String qualification;
		 String primaryProfession;
		 String transportMode;
		 Integer teachingExp;
		 String interestedStudentGrades;
		 String interestedSubjects;
		 String comfortableLocations;
		 String additionalDetails;
		 String encryptedPassword;
		 String userId;
		 Date recordLastUpdated;
		Long recordLastUpdatedMillis;
		 String updatedBy;
		 String preferredTeachingType;
		 List<TutorDocument> documents;
		
		 RegisteredTutorTest(Long tutorId) {
			this.tutorId = tutorId;
			name = "shantanu mukherjee";
			contactNumber = "9739936482";
			emailId = "abc@efg.com";
			tentativeTutorId = 5L;
			dateOfBirth = new Date();
			gender = "01";
			qualification = "02";
			primaryProfession = "03";
			transportMode = "01";
			teachingExp = 5;
			interestedStudentGrades = "01;02;03";
			interestedSubjects = "02;03;04";
			comfortableLocations = "03;04;05";
			additionalDetails = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test";
			encryptedPassword = "";
			userId = "abc";
			recordLastUpdated = new Date();
			recordLastUpdatedMillis = recordLastUpdated.getTime();
			updatedBy = "abcf";
			preferredTeachingType = "01;02";
		}
	}
	
	@Path("/allMappedTutorsList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String allMappedTutorsList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<TutorMapperTest> data = new LinkedList<TutorMapperTest>();
		data.add(new TutorMapperTest(1L));
		data.add(new TutorMapperTest(2L));
		data.add(new TutorMapperTest(3L));
		data.add(new TutorMapperTest(4L));
		data.add(new TutorMapperTest(5L));
		data.add(new TutorMapperTest(6L));
		data.add(new TutorMapperTest(7L));
		data.add(new TutorMapperTest(8L));
		data.add(new TutorMapperTest(9L));
		data.add(new TutorMapperTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/unmapRegisteredTutors")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String unmapRegisteredTutors (
			@FormParam("allIdsList") final String allIdsList,
			@FormParam("comments") final String comments,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("message", "All Ids blacklisted "+allIdsList+" "+comments);		
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/unmapRegisteredTutor")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String unmapRegisteredTutor (
			@FormParam("tutorMapperId") final String tutorMapperId,
			@FormParam("comments") final String comments,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("message", "All Ids mapped "+tutorMapperId+" "+comments);		
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	public class TutorMapperTest {
		
		Long tutorMapperId;
		Long enquiryId;
		Long tutorId;
		String tutorName;
		String tutorEmail;
		String tutorContactNumber;
		Integer quotedTutorRate;
		Integer negotiatedRateWithTutor ;
		String tutorNegotiationRemarks;
		String isTutorContacted;
		Date tutorContactedDate;
		Long tutorContactedDateMillis;
		String isTutorAgreed;
		String isTutorRejectionValid;
		String adminTutorRejectionValidityResponse;
		String tutorResponse;
		String adminRemarksForTutor;
		String isClientContacted;
		Date clientContactedDate;
		Long clientContactedDateMillis;
		String isClientAgreed;
		String clientResponse;
		String isClientRejectionValid;
		String adminClientRejectionValidityResponse;
		String adminRemarksForClient;
		Date adminActionDate;
		Long adminActionDateMillis;
		String adminActionRemarks;
		String whoActed;
		String isDemoScheduled;
		String mappingStatus;
		
		public TutorMapperTest(Long tutorMapperId) {
			this.tutorMapperId = tutorMapperId;
			this.enquiryId = 1L;
			this.tutorId = 2L;
			this.tutorName = "Shantanu Mukherjee";
			this.tutorEmail = "abc@ghm.com";
			this.tutorContactNumber = "563248965";
			this.quotedTutorRate = 895;
			this.negotiatedRateWithTutor  = 124;
			this.tutorNegotiationRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test TestTest Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test Test Test Test Test Test Test";
			this.isTutorContacted = "N";
			this.tutorContactedDate = new Date();
			this.tutorContactedDateMillis = new Date().getTime(); 
			this.isTutorAgreed = "Y";
			this.isTutorRejectionValid = "N";
			this.adminTutorRejectionValidityResponse = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test TestTest Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test Test Test Test Test Test Test";
			this.tutorResponse = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test TestTest Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test Test Test Test Test Test Test";
			this.adminRemarksForTutor = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test TestTest Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test Test Test Test Test Test Test";
			this.isClientContacted = "Y";
			this.clientContactedDate = new Date();
			this.clientContactedDateMillis = new Date().getTime(); 
			this.isClientAgreed = "Y";
			this.clientResponse = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test TestTest Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test Test Test Test Test Test Test";
			this.isClientRejectionValid = "N";
			this.adminClientRejectionValidityResponse = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test TestTest Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test Test Test Test Test Test Test";
			this.adminRemarksForClient = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test TestTest Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test Test Test Test Test Test Test";
			this.adminActionDate = new Date();
			this.adminActionDateMillis = new Date().getTime(); 
			this.adminActionRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test TestTest Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test Test Test Test Test Test Test";
			this.whoActed = "abgd";
			this.isDemoScheduled = "N";
			this.mappingStatus = "FRESH";
		}
	}
	
	@Path("/mappedTutorCheckDataAccess")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String mappedTutorCheckDataAccess (
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("mappedEnquiryFormAccess", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/updateTutorMapperRecord")
	@Consumes({MediaType.MULTIPART_FORM_DATA})
	@POST
	public String updateTutorMapperRecord (
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
	
	@Path("/allDemoReadyMappedTutorsList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String allDemoReadyMappedTutorsList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<TutorMapperTest> data = new LinkedList<TutorMapperTest>();
		data.add(new TutorMapperTest(1L));
		data.add(new TutorMapperTest(2L));
		data.add(new TutorMapperTest(3L));
		data.add(new TutorMapperTest(4L));
		data.add(new TutorMapperTest(5L));
		data.add(new TutorMapperTest(6L));
		data.add(new TutorMapperTest(7L));
		data.add(new TutorMapperTest(8L));
		data.add(new TutorMapperTest(9L));
		data.add(new TutorMapperTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/mappedTutorCheckScheduleDemoAccess")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String mappedTutorCheckScheduleDemoAccess (
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("scheduleDemoFormAccess", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/currentTutorAllMappingList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String currentTutorAllMappingList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<TutorMapperTest> data = new LinkedList<TutorMapperTest>();
		data.add(new TutorMapperTest(1L));
		data.add(new TutorMapperTest(2L));
		data.add(new TutorMapperTest(3L));
		data.add(new TutorMapperTest(4L));
		data.add(new TutorMapperTest(5L));
		data.add(new TutorMapperTest(6L));
		data.add(new TutorMapperTest(7L));
		data.add(new TutorMapperTest(8L));
		data.add(new TutorMapperTest(9L));
		data.add(new TutorMapperTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/currentTutorAllScheduledDemoList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String currentTutorAllScheduledDemoList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<DemoTrackerTest> data = new LinkedList<DemoTrackerTest>();
		data.add(new DemoTrackerTest(1L));
		data.add(new DemoTrackerTest(2L));
		data.add(new DemoTrackerTest(3L));
		data.add(new DemoTrackerTest(4L));
		data.add(new DemoTrackerTest(5L));
		data.add(new DemoTrackerTest(6L));
		data.add(new DemoTrackerTest(7L));
		data.add(new DemoTrackerTest(8L));
		data.add(new DemoTrackerTest(9L));
		data.add(new DemoTrackerTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/updateScheduleDemoMappedTutorRecord")
	@Consumes({MediaType.MULTIPART_FORM_DATA})
	@POST
	public String updateScheduleDemoMappedTutorRecord (
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
	
	public class DemoTrackerTest {
		Long demoTrackerId;
		Long tutorMapperId;
		Date demoDateAndTime;
		Long demoDateAndTimeMillis;
		String demoOccurred;
		String demoStatus;
		String clientRemarks;
		String tutorRemarks;
		String clientSatisfiedFromTutor;
		String tutorSatisfiedWithClient;
		String adminSatisfiedFromTutor;
		String adminSatisfiedWithClient;
		String whoActed;
		String isDemoSuccess;
		String needPriceNegotiationWithClient;
		String clientNegotiationRemarks;
		String needPriceNegotiationWithTutor;
		String tutorNegotiationRemarks;
		String adminRemarks;
		Integer negotiatedOverrideRateWithClient;
		Integer negotiatedOverrideRateWithTutor;
		Date adminActionDate;
		Long adminActionDateMillis;
		String customerName;
		String tutorName;
		String adminFinalizingRemarks;
		String reschedulingRemarks;
		
		public DemoTrackerTest(Long demoTrackerId) {
			this.demoTrackerId = demoTrackerId;
			this.tutorMapperId = 1L;
			this.demoDateAndTime = new Date();
			this.demoDateAndTimeMillis = new Date().getTime();
			this.demoOccurred = "Y";
			this.demoStatus = "SCHEDULED";
			this.clientRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test TestTest Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test Test Test Test Test Test Test";
			this.tutorRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test TestTest Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test Test Test Test Test Test Test";
			this.clientSatisfiedFromTutor = "Y";
			this.tutorSatisfiedWithClient = "Y";
			this.adminSatisfiedFromTutor = "Y";
			this.adminSatisfiedWithClient = "Y";
			this.whoActed = "abcd";
			this.isDemoSuccess = "Y";
			this.needPriceNegotiationWithClient = "Y";
			this.clientNegotiationRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test TestTest Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test Test Test Test Test Test Test";
			this.needPriceNegotiationWithTutor = "Y";
			this.tutorNegotiationRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test TestTest Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test Test Test Test Test Test Test";
			this.adminRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test TestTest Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test Test Test Test Test Test Test";
			this.negotiatedOverrideRateWithClient = 890;
			this.negotiatedOverrideRateWithTutor = 890;
			this.adminActionDate = new Date();
			this.adminActionDateMillis = new Date().getTime();
			this.customerName = "Shantanu Mukherjee";
			this.tutorName = "Shantanu Mukherjee";
			this.adminFinalizingRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test TestTest Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test Test Test Test Test Test Test";
			this.reschedulingRemarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test TestTest Test Test Test Test Test Test Test Test "
					+ "Test Test Test Test Test Test Test Test Test Test Test";
		}
	}
	
	@Path("/scheduledDemoList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String scheduledDemoList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<DemoTrackerTest> data = new LinkedList<DemoTrackerTest>();
		data.add(new DemoTrackerTest(1L));
		data.add(new DemoTrackerTest(2L));
		data.add(new DemoTrackerTest(3L));
		data.add(new DemoTrackerTest(4L));
		data.add(new DemoTrackerTest(5L));
		data.add(new DemoTrackerTest(6L));
		data.add(new DemoTrackerTest(7L));
		data.add(new DemoTrackerTest(8L));
		data.add(new DemoTrackerTest(9L));
		data.add(new DemoTrackerTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/reScheduledDemoList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String reScheduledDemoList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<DemoTrackerTest> data = new LinkedList<DemoTrackerTest>();
		data.add(new DemoTrackerTest(1L));
		data.add(new DemoTrackerTest(2L));
		data.add(new DemoTrackerTest(3L));
		data.add(new DemoTrackerTest(4L));
		data.add(new DemoTrackerTest(5L));
		data.add(new DemoTrackerTest(6L));
		data.add(new DemoTrackerTest(7L));
		data.add(new DemoTrackerTest(8L));
		data.add(new DemoTrackerTest(9L));
		data.add(new DemoTrackerTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/successfulDemoList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String successfulDemoList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<DemoTrackerTest> data = new LinkedList<DemoTrackerTest>();
		data.add(new DemoTrackerTest(1L));
		data.add(new DemoTrackerTest(2L));
		data.add(new DemoTrackerTest(3L));
		data.add(new DemoTrackerTest(4L));
		data.add(new DemoTrackerTest(5L));
		data.add(new DemoTrackerTest(6L));
		data.add(new DemoTrackerTest(7L));
		data.add(new DemoTrackerTest(8L));
		data.add(new DemoTrackerTest(9L));
		data.add(new DemoTrackerTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/failedDemoList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String failedDemoList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<DemoTrackerTest> data = new LinkedList<DemoTrackerTest>();
		data.add(new DemoTrackerTest(1L));
		data.add(new DemoTrackerTest(2L));
		data.add(new DemoTrackerTest(3L));
		data.add(new DemoTrackerTest(4L));
		data.add(new DemoTrackerTest(5L));
		data.add(new DemoTrackerTest(6L));
		data.add(new DemoTrackerTest(7L));
		data.add(new DemoTrackerTest(8L));
		data.add(new DemoTrackerTest(9L));
		data.add(new DemoTrackerTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/cancelledDemoGridList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String cancelledDemoGridList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<DemoTrackerTest> data = new LinkedList<DemoTrackerTest>();
		data.add(new DemoTrackerTest(1L));
		data.add(new DemoTrackerTest(2L));
		data.add(new DemoTrackerTest(3L));
		data.add(new DemoTrackerTest(4L));
		data.add(new DemoTrackerTest(5L));
		data.add(new DemoTrackerTest(6L));
		data.add(new DemoTrackerTest(7L));
		data.add(new DemoTrackerTest(8L));
		data.add(new DemoTrackerTest(9L));
		data.add(new DemoTrackerTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/demoTrackerModifyCheckDataAccess")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String demoTrackerModifyCheckDataAccess (
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("demoTrackerFormAccess", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/cancelDemos")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String cancelDemos (
			@FormParam("allIdsList") final String allIdsList,
			@FormParam("comments") final String comments,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("message", "All Ids blacklisted "+allIdsList+" "+comments);		
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/updateDemoTrackerRecord")
	@Consumes({MediaType.MULTIPART_FORM_DATA})
	@POST
	public String updateDemoTrackerRecord (
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
	

	@Override
	protected void doSecurity(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
