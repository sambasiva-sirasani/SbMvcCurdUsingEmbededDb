package com.siva.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {
	@Id
	private int prodId;
	private String prodCode;
	private Double prodCost;
	
	private Double prodDiscount;
	private Double prodGst;
}

