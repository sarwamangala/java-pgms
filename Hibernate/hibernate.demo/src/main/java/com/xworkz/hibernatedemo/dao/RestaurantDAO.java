package com.xworkz.hibernatedemo.dao;

import org.hibernate.Session;
import org.hibernate.sql.ast.tree.expression.Collation;

import com.xworkz.hibernatedemo.entity.RestaurantEntity;

import jakarta.transaction.Transaction;

public class RestaurantDAO {

	

	public void saveRerestaurant(RestaurantEntity restaurantEntity) {
		configaration configaration=new Configaration();
		configaration.configure();
		
		SessionFactory sessinFactory =  configaration.buildSessionFactory();
		
		Session session =(Session) session.beginTransaction();
		
		Transaction tx = (Transaction) session.beginTransaction();
		
		session.persist(entity);
		
		
		tx.commit();
		
		
	}
	

}
