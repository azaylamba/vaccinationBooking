package com.relevel.vaccinationbooking.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {

    @Id
    private long booking_id;
}
