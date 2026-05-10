package com.al.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wg")
public class WishMessageGenrator {

	public ResponseEntity<String> showMessage(){
		int hour=LocalDateTime.now().getHour();
		
		String msg=null;
		if(hour<12) {
			msg="good Morning";
		}
		else {
			msg="good Afternoon";
		}
		
		ResponseEntity<String> res = 
				new ResponseEntity<String>(msg, HttpStatus.OK);
		return res;
	}
}
