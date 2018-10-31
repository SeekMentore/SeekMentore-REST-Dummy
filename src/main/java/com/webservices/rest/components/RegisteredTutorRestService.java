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

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.constants.RestMethodConstants;
import com.constants.ScopeConstants;
import com.model.gridcomponent.GridComponent;
import com.webservices.rest.AbstractRestWebservice;

@Component
@Scope(ScopeConstants.SCOPE_NAME_PROTOTYPE) 
@Path("/registeredTutor") 
public class RegisteredTutorRestService extends AbstractRestWebservice implements RestMethodConstants {
	
	
	@Path("/uploadedDocuments")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String uploadedDocuments (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<TutorDocumentTest> data = new LinkedList<TutorDocumentTest>();
		data.add(new TutorDocumentTest(1L));
		data.add(new TutorDocumentTest(2L));
		data.add(new TutorDocumentTest(3L));
		data.add(new TutorDocumentTest(4L));
		data.add(new TutorDocumentTest(5L));
		data.add(new TutorDocumentTest(6L));
		data.add(new TutorDocumentTest(7L));
		data.add(new TutorDocumentTest(8L));
		data.add(new TutorDocumentTest(9L));
		data.add(new TutorDocumentTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	public class TutorDocumentTest {
		 Long documentId;
		 Long tutorId;
		 String fsKey;
		 String filename;
		 String isApproved;
		 String whoActed;
		 String remarks;
		 Date actionDate;
		 Long actionDateMillis;
		 byte[] content;
		
		 public TutorDocumentTest(Long documentId) {
			this.documentId = documentId;
			tutorId = 1L;
			fsKey = "random key";
			filename = "Fake file";
			isApproved = documentId%2 == 0 ? "Y" : "N";
			whoActed = "abcf";
			remarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test";
			actionDate = new Date();
			actionDateMillis = actionDate.getTime();			
		}
	}
	
	@Path("/bankDetails")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String bankDetails (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<BankAccount> data = new LinkedList<BankAccount>();
		data.add(new BankAccount(1L));
		data.add(new BankAccount(2L));
		data.add(new BankAccount(3L));
		data.add(new BankAccount(4L));
		data.add(new BankAccount(5L));
		data.add(new BankAccount(6L));
		data.add(new BankAccount(7L));
		data.add(new BankAccount(8L));
		data.add(new BankAccount(9L));
		data.add(new BankAccount(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	public class BankAccount {
		 Long bankAccountId;
		 String bankName;
		 String accountNumber;
		 String ifscCode;
		 String accountHolderName;
		 String isDefault;		 
		
		public BankAccount(Long bankAccountId) {
			this.bankAccountId = bankAccountId;
			bankName = "KOTAK MAHINDRA";
			accountNumber = "1712179763";
			ifscCode = "Fake file";
			isDefault = bankAccountId%2 == 0 ? "Y" : "N";
			accountHolderName = "AMIT MISHRA";
		}
	}
	
	@Path("/currentPackages")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String currentPackages (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<SubscriptionPackage> data = new LinkedList<SubscriptionPackage>();
		data.add(new SubscriptionPackage(1L));
		data.add(new SubscriptionPackage(2L));
		data.add(new SubscriptionPackage(3L));
		data.add(new SubscriptionPackage(4L));
		data.add(new SubscriptionPackage(5L));
		data.add(new SubscriptionPackage(6L));
		data.add(new SubscriptionPackage(7L));
		data.add(new SubscriptionPackage(8L));
		data.add(new SubscriptionPackage(9L));
		data.add(new SubscriptionPackage(10L));		
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
		List<SubscriptionPackage> data = new LinkedList<SubscriptionPackage>();
		data.add(new SubscriptionPackage(1L));
		data.add(new SubscriptionPackage(2L));
		data.add(new SubscriptionPackage(3L));
		data.add(new SubscriptionPackage(4L));
		data.add(new SubscriptionPackage(5L));
		data.add(new SubscriptionPackage(6L));
		data.add(new SubscriptionPackage(7L));
		data.add(new SubscriptionPackage(8L));
		data.add(new SubscriptionPackage(9L));
		data.add(new SubscriptionPackage(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	public class SubscriptionPackage {
		 Long subscriptionPackageId;
		 String customerName;
		 Integer totalHours;
		 Date startDate;
		 Long startDateMillis;
		 Integer completedHours;
		 Date endDate;
		 Long endDateMillis;
		
		 public SubscriptionPackage(Long subscriptionPackageId) {
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
	
	@Path("/approveTutorDocument")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String approveTutorDocument (
			@FormParam("selectedId") final String selectedId,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("message", "Document Approved");		
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/approveMultipleTutorDocument")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String approveMultipleTutorDocument (
			@FormParam("selectedIdsList") final String selectedIdsList,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("message", "All Documents Approved");		
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/sendReminderTutorDocument")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String sendReminderTutorDocument (
			@FormParam("selectedId") final String selectedId,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("message", "Document Sent Reminder");		
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/sendReminderMultipleTutorDocument")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String sendReminderMultipleTutorDocument (
			@FormParam("selectedIdsList") final String selectedIdsList,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("message", "All Documents Sent Reminder");		
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/rejectTutorDocument")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String rejectTutorDocument (
			@FormParam("selectedId") final String selectedId,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("message", "Document Rejected");		
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/rejectMultipleTutorDocument")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String rejectMultipleTutorDocument (
			@FormParam("selectedIdsList") final String selectedIdsList,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("message", "All Documents Rejected");		
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/approveBankAccount")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String approveBankAccount (
			@FormParam("selectedId") final String selectedId,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("message", "Bank Account Approved");		
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/approveMultipleBankAccount")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String approveMultipleBankAccount (
			@FormParam("selectedIdsList") final String selectedIdsList,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("message", "All Bank Accounts Approved");		
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/makeDefaultBankAccount")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String makeDefaultBankAccount (
			@FormParam("selectedId") final String selectedId,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("message", "Bank Account Made Default");		
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/rejectBankAccount")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String rejectBankAccount (
			@FormParam("selectedId") final String selectedId,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("message", "Bank Account Rejected");		
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/rejectMultipleBankAccount")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String rejectMultipleBankAccount (
			@FormParam("selectedIdsList") final String selectedIdsList,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("message", "All Bank Accounts Rejected");		
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/updateTutorRecord")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String updateTutorRecord (
			@FormParam("completeTutorRecord") final String completeTutorRecord,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("success", true);
		restresponse.put("message", "Tutor Record Updated");		
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}

	@Override
	protected void doSecurity(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
