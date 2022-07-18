package com.cognizant.calculateNetworth.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.calculateNetworth.model.AuthResponse;



@FeignClient(name = "authorization-service", url = "http://authpod5.us-west-2.elasticbeanstalk.com")
public interface AuthClient {
	@RequestMapping(value = "/validate", method = RequestMethod.GET)
	public AuthResponse getValidity(@RequestHeader("Authorization") String token);

}
