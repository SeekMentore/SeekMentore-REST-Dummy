var ctxPath = '/seekmentore';

commonErrorHandler = function(error) {
	$('#response').html('Connection lost.<br/>Please check your network connection and refresh the page.');
}

commmonSuccessHandler = function(response) {
	$('#response').html(encodeObjectAsJSON(response));
}

function encodeObjectAsJSON(object) {
	return null != object ? JSON.stringify(object) : null;
}

function decodeObjectFromJSON(json) {
	return null != json ? JSON.parse(json) : null;
}

function callWebservice(url, data, success, failure, method, contentType) {
	$('#response').html('');
	$.ajax({
        url			: ctxPath + url,
        type		: ((null != method) ? method : 'POST'),
        data		: data,
        contentType	: ((null != contentType) ? contentType : 'application/json'),
        cache		: false,
        dataType	: 'json',
        success		: function(data) {
        				var response = decodeObjectFromJSON(data.response)
			        	if (null != success) {
			        		success(response);
			        	} else {
			        		commmonSuccessHandler(response);
			        	}
		},
		error		: function(error) {
			        	if (null != failure) {
			        		failure(error);
			        	} else {
			        		commonErrorHandler(error);
			        	}
		}
    });
}
