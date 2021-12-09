package com.cities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cities.models.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{

}
