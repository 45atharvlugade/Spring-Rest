package com.arl.model;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Component
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {

	private Integer id;
	
	private String name;
	
	private String address;
	
	private Double percentage;
	
	private List<Course> courses;
	
	private String[] friends;
}
