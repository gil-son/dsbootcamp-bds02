package com.devsuperior.bds02.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds02.services.CityService;
import com.devsuperior.bds02.services.EventService;

@RestController
@RequestMapping(value = "/events")
public class EventController {

	
	private final EventService service;
	
	
	EventController(EventService service) {
		this.service = service;
	}
	
	
}
