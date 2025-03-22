package com.codewithathul.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Products {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private double price;
	
	private int qty;
	
	
	
	
}
