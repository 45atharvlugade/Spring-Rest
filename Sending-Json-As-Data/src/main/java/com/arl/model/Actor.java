package com.arl.model;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actor {

	private Integer aid;
	
	private String aname;
	
	private String address;
	
	private Double income;
	
	private String[] facColours;
	
	private List<String> friends;
	
	private Map<String,Object> idDetails;
	
	private Customer cust;
}
