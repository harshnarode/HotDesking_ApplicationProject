package com.HDAP.Entities.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HDAP.Entities.Office;


@Repository
public interface OfficeRepo extends JpaRepository<Office, Integer>{

}
