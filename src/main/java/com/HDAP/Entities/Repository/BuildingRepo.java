package com.HDAP.Entities.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HDAP.Entities.Building;

@Repository
public interface BuildingRepo extends JpaRepository<Building, Integer>{

}
