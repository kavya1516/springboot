package com.springboot.learningliquibase;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

   @RestController
   public class CustomerController {

       @Autowired
       private CustomerRepository customerRepository;

       @GetMapping("/customers")
       public ResponseEntity<List<Customer>> getAllCustomers() {
           List<Customer> customers = customerRepository.findAll();
           return new ResponseEntity<>(customers, HttpStatus.OK);
       }
   }