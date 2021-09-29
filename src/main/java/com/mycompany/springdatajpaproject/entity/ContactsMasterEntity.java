package com.mycompany.springdatajpaproject.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Lombok's annotation to create getter and setter
@Data
//entity annotation represents this java class as an Entity Class
@Entity
@Table(name = "contacts_master")
public class ContactsMasterEntity {
    @Id
    @Column(name="contact_id")
    private int contactId;
    @Column(name = "contact_name")
    private String contactName;
    @Column(name = "contact_number")
    private int contactNumber;

}
