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
import com.constants.RestPathConstants;
import com.constants.ScopeConstants;
import com.constants.components.AdminConstants;
import com.model.components.TutorDocument;
import com.model.gridcomponent.GridComponent;
import com.webservices.rest.AbstractRestWebservice;

@Component
@Scope(ScopeConstants.SCOPE_NAME_PROTOTYPE) 
@Path(RestPathConstants.REST_SERVICE_PATH_ADMIN) 
public class AdminRestService extends AbstractRestWebservice implements RestMethodConstants, AdminConstants {
	
	
	@Path("/registeredTutorsList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String registeredTutorsList (
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
	
	@Path("/registeredTutorCheckDataAccess")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String registeredTutorCheckDataAccess (
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("documentViewAccess", true);
		restresponse.put("documentHandleAccess", true);
		restresponse.put("bankViewAccess", true);
		restresponse.put("bankHandleAccess", true);
		restresponse.put("formDataEditAccess", true);
		restresponse.put("activePackageViewAccess", true);
		restresponse.put("historyPackagesViewAccess", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/subscribedCustomersList")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String subscribedCustomersList (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<SubscribedCustomerTest> data = new LinkedList<SubscribedCustomerTest>();
		data.add(new SubscribedCustomerTest(1L));
		data.add(new SubscribedCustomerTest(2L));
		data.add(new SubscribedCustomerTest(3L));
		data.add(new SubscribedCustomerTest(4L));
		data.add(new SubscribedCustomerTest(5L));
		data.add(new SubscribedCustomerTest(6L));
		data.add(new SubscribedCustomerTest(7L));
		data.add(new SubscribedCustomerTest(8L));
		data.add(new SubscribedCustomerTest(9L));
		data.add(new SubscribedCustomerTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	class SubscribedCustomerTest {
		 Long customerId;
		 String name;
		 String contactNumber;
		 String emailId;
		 Long enquiryID;
		 String studentGrades;
		 String interestedSubjects;
		 String location;
		 String addressDetails;
		 String additionalDetails;
		 String encryptedPassword;
		 String userId;
		 Date recordLastUpdated;
		 Long recordLastUpdatedMillis;
		 String updatedBy;
		
		 SubscribedCustomerTest(Long customerId) {
			this.customerId = customerId;
			name = "shantanu mukherjee";
			contactNumber = "9739936482";
			emailId = "abc@efg.com";
			enquiryID = 5L;
			studentGrades = "01;02;03";
			interestedSubjects = "02;03;04";
			location = "03";
			addressDetails = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test";
			additionalDetails = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test";
			encryptedPassword = "";
			userId = "abc";
			recordLastUpdated = new Date();
			recordLastUpdatedMillis = recordLastUpdated.getTime();
			updatedBy = "abcf";
		}
	}
	
	@Path("/subscribedCustomerCheckDataAccess")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String subscribedCustomerCheckDataAccess (
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("formDataEditAccess", true);
		restresponse.put("activePackageViewAccess", true);
		restresponse.put("historyPackagesViewAccess", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}

	@Override
	protected void doSecurity(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
