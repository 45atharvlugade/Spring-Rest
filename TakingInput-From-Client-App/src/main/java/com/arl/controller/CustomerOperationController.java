package com.arl.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arl.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerOperationController {

	@PostMapping("/register")
	public ResponseEntity<String> registerCustomer(@RequestBody Customer customer){
		System.out.println("Customer Object Registered Succeffully");
		return new ResponseEntity<String>(customer.toString(),HttpStatus.OK);
	}
}
