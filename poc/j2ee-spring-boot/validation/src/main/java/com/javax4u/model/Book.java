package com.javax4u.model;

import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;

public class Book {

	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty(message="Please provide a name")
	private String name;
	
	@NotEmpty(message="Please provide an author")
	private String author;
	
	@NotEmpty(message="Please provide a price")
	@DecimalMin("1.00")
	private BigDecimal price;
	
	
	
}
