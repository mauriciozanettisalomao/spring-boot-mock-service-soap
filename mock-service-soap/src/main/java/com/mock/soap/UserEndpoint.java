package com.mock.soap;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.ArrayOfJavaLangstringLiteral;
import io.spring.guides.gs_producing_web_service.ChangePasswordRequest;
import io.spring.guides.gs_producing_web_service.ChangePasswordResponse;

@Endpoint
public class UserEndpoint {
	
	 private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	    private UserRepository userRepository;

	    @Autowired
	    public UserEndpoint(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "changePasswordRequest")
	    @ResponsePayload
	    public ChangePasswordResponse getUser(@RequestPayload ChangePasswordRequest request) {
	    	ChangePasswordResponse response = new ChangePasswordResponse();
	    	ArrayOfJavaLangstringLiteral array = new ArrayOfJavaLangstringLiteral();
	    	
	    	array.setJavaLangstring(userRepository.findUser(request.getLogin()));

	        response.setPassword(array);

	        return response;
	    }
}
