package com.devsuperior.bds02.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.bds02.repositories.CityRepository;
import com.devsuperior.bds02.entities.City;

import com.devsuperior.bds02.dto.CityDTO;


@Service
public class CityService {
	
	private CityRepository repository;
	
	
	CityService(CityRepository repository){
		this.repository = repository;
	}
	
	@Transactional(readOnly = true)
	public List<CityDTO> findAll(){
		List<City> list = repository.findAll(Sort.by(Sort.Direction.ASC,"name"));
		return list.stream().map(x -> new CityDTO(x)).collect(Collectors.toList());
	}
	

	public void delete(Long id) {
		
		repository.deleteById(id);
		
	}
	
	
}
