package org.jsp.merchantproduct.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.jsp.merchantproduct.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	@Autowired
	private EntityManager manager;
	
	public Product saveProdu(Product p) {
		EntityTransaction transaction=manager.getTransaction();
		
		manager.persist(p);
		transaction.begin();
		transaction.commit();
		return p;
	}

}
