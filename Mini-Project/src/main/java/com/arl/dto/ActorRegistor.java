package com.arl.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActorRegistor {
		
	private String aname;
	
	
	private String category;
	
	
	private String fee;
	
	
	private LocalDateTime dob;
}
