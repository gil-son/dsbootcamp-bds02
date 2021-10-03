package com.devsuperior.bds02.controllers;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds01.dto.CityDTO;
import com.devsuperior.bds02.dto.CityDTO;
import com.devsuperior.bds02.services.CityService;
import com.devsuperior.dscatalog.dto.CityDTO;


@RestController
@RequestMapping(value = "/cities")
public class CityController {

	
	private final CityService service;
	
	
	CityController(CityService service) {
		this.service = service;
	}
	
	
	
	
	@GetMapping
	public ResponseEntity<List<CityDTO>> findAll(){
		
		List<CityDTO> listDTO = service.findAll();
		return ResponseEntity.ok().body(listDTO);
	}
	
	
	
	
}
