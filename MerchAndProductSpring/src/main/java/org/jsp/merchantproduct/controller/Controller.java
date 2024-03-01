package org.jsp.merchantproduct.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.jsp.merchantproduct.config;
import org.jsp.merchantproduct.dao.MerchantDao;
import org.jsp.merchantproduct.dao.ProductDao;
import org.jsp.merchantproduct.dto.Merchant;
import org.jsp.merchantproduct.dto.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Controller {
	static MerchantDao dao;
	static ProductDao pdao;
	static Scanner sc=new Scanner(System.in);
	static{
		ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
		dao=context.getBean(MerchantDao.class);
		pdao=context.getBean(ProductDao.class);

	}
	public static void main(String[] args) {
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:save();
		break;
		case 2:savep();
		break;


		default:
			break;
		}

	}
	public static void save() {
		Merchant m=new Merchant();
		m.setName("vish");
		List<Product> l1=new ArrayList<Product>();
		Product p1=new Product();
		p1.setName("v");

		Product p2=new Product();
		p2.setName("vi");
		l1.add(p1);
		l1.add(p2);
		m.setProduct(l1);
		m=dao.saveMerch(m);
	}
	public static void savep() {
		Product p=new Product();
		p.setName("vish");
		pdao.saveProdu(p);
	}
}
