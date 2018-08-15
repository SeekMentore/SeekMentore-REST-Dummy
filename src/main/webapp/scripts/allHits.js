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