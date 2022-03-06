package com.spring.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class CustomerInfoPortal {

    @Id
    private String id;
    private String scanType;
    private String processPayment;

}
