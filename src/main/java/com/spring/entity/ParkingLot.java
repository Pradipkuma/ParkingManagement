package com.spring.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "parking")
public class ParkingLot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String address;
    private String parkingFloor;
    private String entrancePanel;
    private String newParkingTicket;
    private String isFull;
}
