package com.xworkz.hibernatedemo.runner;
import com.xworkz.hibernatedemo.entity.RestaurantEntity;



public  void saveRestaurant("RestaurantEntity entity") {
public class RunnerClass {
	public static void main(String []args) {
	  RestaurantEntity restaurantEntity=new RestaurantEntity;
	  restaurantEntity.setRestaurantId(1);
	  restaurantEntity.setContactNo(876435889889989);
	  restaurantEntity.setName("saru");
	  restaurantEntity.setRating(4.1);
	  restaurantEntity.setType("Udupi garden");
	  
	  
	  
	  ReatorantDAO RESTAURANTdao=new RestaurantDAO();
	  restaurantDAO.saveRerestaurant(restaurantEntity);
	  System.out.println("save Succesfull");
	  
	  
	
	
	}
	
}
	}


