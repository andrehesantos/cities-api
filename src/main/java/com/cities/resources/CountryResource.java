package com.cities.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cities.models.Country;
import com.cities.repositories.CountryRepository;

@RestController
@RequestMapping("/countries")
public class CountryResource {
	
	@Autowired
	private CountryRepository cr;
	
	@GetMapping
	public List<Country> countries(){
		return cr.findAll();
	}
	
}
