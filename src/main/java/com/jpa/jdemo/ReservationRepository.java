package com.jpa.jdemo;


import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ReservationRepository extends CrudRepository<Reservation, Integer> {

    List<Reservation> findByName(String name);

}
