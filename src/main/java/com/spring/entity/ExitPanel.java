package com.spring.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ExitPanel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String scanTicket;
    private String processPayment;
}
