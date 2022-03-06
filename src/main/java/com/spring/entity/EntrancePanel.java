package com.spring.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "entrance_panel")
public class EntrancePanel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String printTicket;

}
