package com.arl.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arl.model.Course;
import com.arl.model.Student;

@RestController
@RequestMapping("/student")
public class StudentManagementController {

	 @GetMapping("/getData")
      public ResponseEntity<Student> getStudentDetails() {
    	  
		 Student st=new Student(102, "Atharv Lugade", "Pune", 89.00, List.of(new Course(1,"HTML"),new Course(2,"CSS"),new Course(3,"JS")), new String[] {"Atharv","Parag","Rajesh"});
		 
		 return new ResponseEntity<Student>(st,HttpStatus.OK);
		 
      }
}
