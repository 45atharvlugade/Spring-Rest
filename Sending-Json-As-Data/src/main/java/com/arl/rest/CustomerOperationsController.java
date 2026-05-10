package com.arl.rest;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arl.model.Actor;
import com.arl.model.Customer;


@RestController
@RequestMapping("/customer")
public class CustomerOperationsController {

	
	@GetMapping("/getData")
	public ResponseEntity<Customer> showCustomerData(){
		Customer cust=new Customer(100,"Atharv","Kolhapur",3456.89);
		return new ResponseEntity<Customer>(cust,HttpStatus.OK);
	}
	
	@GetMapping("/report")
	public ResponseEntity<Actor> showActorData(){
		Actor actor = new Actor(
		        1,
		        "Atharv",
		        "Mumbai",
		        1233446.77,
		        new String[]{"Pink", "Red", "Bhagva"},
		        List.of("Ishan", "kishan"),
		        Map.of("aadhar1", 9999999L, "aadhar2", 99987526882L),
		        new Customer()
		);
		
	  return new ResponseEntity<Actor>(actor,HttpStatus.OK);
	}
}
