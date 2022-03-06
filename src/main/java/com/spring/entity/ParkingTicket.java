package com.spring.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ParkingTicket {

    private String ticketNumber;
    private LocalDate issueAt;
    private LocalDate payedAt;
    private double payedAmount;
    private String parkingTicketStatus;
}
