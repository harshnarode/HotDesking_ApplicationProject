package com.HDAP.Entities.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HDAP.Entities.City;

@Repository
public interface CityRepo extends JpaRepository<City, Integer>{

}
