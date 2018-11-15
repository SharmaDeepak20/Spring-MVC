package com.infogain.service;

import java.util.ArrayList;
import java.util.List;

import om.infogain.bean.Product;

public class ProductServiceImpl {

	List<Product> pList=new ArrayList<>();
	
	public void addProduct(Product p)
	{
	   pList.add(p);	
	}
	
	public List<Product> showProducts()
	{
		return pList;
	}
}
