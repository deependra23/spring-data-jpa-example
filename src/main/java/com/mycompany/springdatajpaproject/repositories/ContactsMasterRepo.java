package com.mycompany.springdatajpaproject.repositories;

import com.mycompany.springdatajpaproject.entity.ContactsMasterEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ContactsMasterRepo extends CrudRepository <ContactsMasterEntity, Serializable>{

    public ContactsMasterEntity findByContactName(String name);
    //this method will generate query like below
    //select * from contacts_master where contact_name = 'name';

}

