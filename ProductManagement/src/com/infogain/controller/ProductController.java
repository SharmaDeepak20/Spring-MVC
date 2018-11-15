package com.infogain.controller;



import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.infogain.service.ProductServiceImpl;

import om.infogain.bean.Product;

@Controller
public class ProductController {

	
	private ProductServiceImpl psr=new ProductServiceImpl();
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public ModelAndView addProduct()
	{
		return new ModelAndView("index","command",new Product());
	}//end addProduct
	
	@RequestMapping(value="/addProduct", method=RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product, ModelMap model)
	{
		psr.addProduct(product);
		return "commonPage";
	}
	
	@RequestMapping(value="/showAllProducts" ,method=RequestMethod.GET)
	public ModelAndView showAllPRoducts()
	{
		Map<String, Object> pMap=new HashMap<>();
		pMap.put("products", psr.showProducts());
		return new ModelAndView("showAllProducts",pMap);
	}
}