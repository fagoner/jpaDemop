package com.jpa.jdemo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class DemoTest {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void firstTest() {
        Reservation re = new Reservation(1, "To H.K.");
        Object reservation = reservationRepository.save(re);
        assertThat(reservation).isNotNull();
        assertThat(reservation).isInstanceOf(Reservation.class);
    }
}
