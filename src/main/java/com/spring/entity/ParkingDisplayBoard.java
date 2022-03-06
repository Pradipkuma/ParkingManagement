package com.spring.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "parking_display_board")
public class ParkingDisplayBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String handicappedFreeSpot;
    private String compactFreeSpot;
    private String largeFreeSpot;
    private String moterBickFreeSpot;
    private String electricFreeSpot;
    private String showEmptySpotNumber;

}
