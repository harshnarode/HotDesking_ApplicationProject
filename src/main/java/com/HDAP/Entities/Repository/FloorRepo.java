package com.HDAP.Entities.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HDAP.Entities.Floor;

@Repository
public interface FloorRepo extends JpaRepository<Floor, Integer> {

}
