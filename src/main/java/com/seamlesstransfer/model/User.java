package com.seamlesstransfer.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {
   
	@Id
	@GeneratedValue(Strategy = GenerationType.IDENTITY)
	private Long id;
	
}
