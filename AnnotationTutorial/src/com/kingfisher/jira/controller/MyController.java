package com.kingfisher.jira.controller;

import com.kingfisher.wiki.service.MyService;
import com.spring.io.GetMapping;
import com.spring.io.RestController;
import com.spring.io.Autowired;

@RestController("/app")
public class MyController {

	@Autowired
	MyService service;

	@GetMapping("/v1/data")
	public void getData() {

	}

}
