package com.HDAP.Entities.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.HDAP.Entities.Seat;


@Repository
public interface SeatRepo extends JpaRepository<Seat, Integer>{

}
