package org.jsp.merchantproduct.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.jsp.merchantproduct.dto.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@SuppressWarnings("all")
@Repository
public class MerchantDao {
	@Autowired
	private EntityManager manager;
	
	public Merchant saveMerch(Merchant m) {
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(m);
		transaction.begin();
		transaction.commit();
		return m;
	}

}
