package com.devsuperior.bds02.controllers;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.devsuperior.bds02.dto.CityDTO;
import com.devsuperior.bds02.services.CityService;



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
	
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	
}
