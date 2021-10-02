package com.devsuperior.bds02.services;

import org.springframework.stereotype.Service;

import com.devsuperior.bds02.repositories.CityRepository;

@Service
public class CityService {
	
	private CityRepository repository;
	
	
	CityService(CityRepository repository){
		this.repository = repository;
	}

}
