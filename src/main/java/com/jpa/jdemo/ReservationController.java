package com.jpa.jdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReservationController {


    @Autowired
    ReservationRepository reservationRepository;

    @GetMapping("")
    public Iterable<Reservation> findAll() {
        return reservationRepository.findAll();
    }


}
