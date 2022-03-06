package com.spring.entity;

import java.time.LocalDate;

public class Payment {

    private LocalDate createDate;
    private double amount;
    private String paymentStatus;
    public boolean initiateTransaction(){
        return false;
    }
}
