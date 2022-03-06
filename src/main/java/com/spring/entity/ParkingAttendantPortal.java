package com.spring.entity;

import lombok.Data;
import org.hibernate.annotations.Tables;

import javax.persistence.*;

@Data
@Entity
@Table(name = "parking_attendant_portal")
public class ParkingAttendantPortal {

    @Id
    private String id;
    private String scanTicket;
    private String paymentProcessing;
}
