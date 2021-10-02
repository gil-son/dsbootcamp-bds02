package com.devsuperior.bds02.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds02.services.CityService;

@RestController
@RequestMapping(value = "/cities")
public class CityController {

	
	private final CityService service;
	
	
	CityController(CityService service) {
		this.service = service;
	}
	
	
}
