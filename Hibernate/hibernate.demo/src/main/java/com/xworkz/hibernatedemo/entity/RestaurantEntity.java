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
@Column(name="contact_tno")
	private long contactNo;
public void setName(String string) {
	// TODO Auto-generated method stub
	
}
public void setRating(double d) {
	// TODO Auto-generated method stub
	
}
public void setcontactNo(long l) {
	// TODO Auto-generated method stub
	
}
public void setRestaurantId(int i) {
	// TODO Auto-generated method stub
	
}
public void setType(String string) {
	// TODO Auto-generated method stub
	
}
		
	}

		
	

	
	
