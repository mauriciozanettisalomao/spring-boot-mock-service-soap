package com.mock.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.ArrayOfJavaLangstringLiteral;
import io.spring.guides.gs_producing_web_service.LoginNovoFrontRequest;
import io.spring.guides.gs_producing_web_service.LoginNovoFrontResponse;

@Endpoint
public class UserEndpoint {
	
	 private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	    private UserRepository userRepository;

	    @Autowired
	    public UserEndpoint(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "loginNovoFrontRequest")
	    @ResponsePayload
	    public LoginNovoFrontResponse getUser(@RequestPayload LoginNovoFrontRequest request) {
	    	LoginNovoFrontResponse response = new LoginNovoFrontResponse();
	    	
	    	response = userRepository.findUser(request.getLogin());

	        return response;
	    }
}
