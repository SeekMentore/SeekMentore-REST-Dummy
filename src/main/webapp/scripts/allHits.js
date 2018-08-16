function login() {
	var successdata = { 
			userId		: 'seek', 
			password	: 'mentore', 
			userType	: 'admin'
	}
	var failuredata = { 
			userId		: 'seek', 
			password	: 'unknown', 
			userType	: 'admin'
	}
	callWebservice('/rest/login/validateCredential', successdata, null, null, null, 'application/x-www-form-urlencoded');
}

function resetPassword() {
	var successdata = { 
			userId		: 'seek', 
			userType	: 'admin'
	}
	var failuredata = { 
			userId		: 'seek', 
			userType	: 'tutor'
	}
	callWebservice('/rest/login/resetPassword', failuredata, null, null, null, 'application/x-www-form-urlencoded');
}

function getErrorDetails() {
	var data404 = { 
			errorCode		: '404'
	}
	var data500 = { 
			errorCode		: '500'
	}
	var dataUnknown = { 
			errorCode		: '600'
	}
	callWebservice('/rest/commons/getErrorDetails', dataUnknown, null, null, null, 'application/x-www-form-urlencoded');
}

function updateEnquiryDetails() {
	var form = {
			enquiryId					: 2
		};
	callWebservice('/rest/login/updateEnquiryDetails', encodeObjectAsJSON(form));
}