package com.xworkz.hibernatedemo.runner;
import com.xworkz.hibernatedemo.dao.RestaurantDAO;
import com.xworkz.hibernatedemo.entity.RestaurantEntity;


public class RunnerClass {
	public static void main(String []args) {
	  RestaurantEntity restaurantEntity=new RestaurantEntity();
	  restaurantEntity.setRestaurantId(1);
	  restaurantEntity.setcontactNo(8764358898L);
	  restaurantEntity.setName("saru");
 restaurantEntity.setRating(4.1);
	  restaurantEntity.setType("Udupi garden");
	  
	  
	  
	  RestaurantDAO restaurantdao=new RestaurantDAO();
	  restaurantdao.saveRerestaurant(restaurantEntity);
	  System.out.println("save Succesfull");
	  
	  
	
	
	}
	
}
	


