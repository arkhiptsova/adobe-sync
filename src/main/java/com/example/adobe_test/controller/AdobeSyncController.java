package com.example.adobe_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/docker")
public class AdobeSyncController {

	@GetMapping
	public String index(){
		return "Hello World";
	}

}