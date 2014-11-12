package com.caizhidao.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.Resource;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

public class aa extends ResourceHttpRequestHandler {
	
	@Override
	protected Resource getResource(HttpServletRequest request) {
		// TODO Auto-generated method stub
		System.out.println("============================>>" + request);
		return super.getResource(request);
	}

	@Override
	protected void writeContent(HttpServletResponse response, Resource resource)
			throws IOException {
		System.out.println("====================================>" + resource);
		super.writeContent(response, resource);
	}
}
