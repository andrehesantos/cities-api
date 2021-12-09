package com.cities.resources;


import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public Page<Country> countries(Pageable page){
		return cr.findAll(page);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Country> find(@PathVariable long id) {
		Optional<Country> op = cr.findById(id);
		if(op.isPresent()) {
			return ResponseEntity.ok(op.get());
		}
		else {
			return ResponseEntity.notFound().build();
		}
		
	}
}
