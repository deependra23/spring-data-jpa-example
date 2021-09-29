package com.mycompany.springdatajpaproject;

import com.mycompany.springdatajpaproject.entity.ContactsMasterEntity;
import com.mycompany.springdatajpaproject.repositories.ContactsMasterRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringdatajpaprojectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(SpringdatajpaprojectApplication.class, args);

		ContactsMasterRepo bean =  ctxt.getBean(ContactsMasterRepo.class);

		ContactsMasterEntity cme = new ContactsMasterEntity();
		cme.setContactId(103);
		cme.setContactName("Deep");
		cme.setContactNumber(890009338);
		//saving data using crud repository
		bean.save(cme);


		//below code retrieve data from the database using findByContactName method from Repo class

		ContactsMasterEntity entity = bean.findByContactName("Deep");
		System.out.println(entity);

		ctxt.close();
	}

}
