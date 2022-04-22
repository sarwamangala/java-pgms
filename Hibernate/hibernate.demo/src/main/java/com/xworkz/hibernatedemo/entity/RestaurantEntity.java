package com.xworkz.hibernatedemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="restaurant")
public class RestaurantEntity {
@Id
@Column(name="id")
	private int restaurantId;
@Column(name="contactno")
	private int contactNo;
@Column(name="name"
)
	private String name;
	private String type;
	private double rating;
}
	
	
