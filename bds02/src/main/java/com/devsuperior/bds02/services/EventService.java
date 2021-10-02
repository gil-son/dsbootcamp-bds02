package com.devsuperior.bds02.services;

import org.springframework.stereotype.Service;

import com.devsuperior.bds02.repositories.EventRepository;

@Service
public class EventService {

	private EventRepository repository;
	
	
	EventService(EventRepository repository){
		this.repository = repository;
	}
	
}
