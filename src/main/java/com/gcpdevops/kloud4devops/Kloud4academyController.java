package com.gcpdevops.kloud4devops;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import model.ProductDataBean;
import model.ProductEntity;

@RestController
public class Kloud4academyController {

	Logger logger = LoggerFactory.getLogger(Kloud4academyController.class);
	
	@Autowired
	private ClientService apiServiceManager;

//	@RequestMapping(value={"/fetchProductsUsingCategory/{categoryId}","/fetchProductsUsingCategory/fetchProductsUsingCategory/{categoryId}","/fetchProductsUsingCategory/fetchProductsUsingCategory/fetchProductsUsingCategory/{categoryId}"},method = RequestMethod.GET)
//	public ModelAndView fetchProductsUsingCategory(@PathVariable String categoryId) {
//		logger.info("------------Product List controller called"+categoryId);
//		ModelAndView mv = null;
//		List<ProductEntity> productsData = apiServiceManager.fetchProductsByCategory(categoryId);
//		logger.info("ProductResponse" +productsData);
//		List<ProductDataBean> productList = new ArrayList<ProductDataBean>();
//		if(productsData != null) {
//			for (Object product : productsData) {
//				ProductEntity productEntity = (ProductEntity)product;
//				ProductDataBean productDataBean = new ProductDataBean();
//				productDataBean.setCategory(productEntity.getCategory());
//				productDataBean.setImageURL(productEntity.getImageURL());
//				productDataBean.setPrice(productEntity.getPrice());
//				productDataBean.setProductDesc(productEntity.getProductDesc());
//				productDataBean.setProductId(productEntity.getProductId());
//				productDataBean.setProductName(productEntity.getProductName());
//				productDataBean.setProductType(productEntity.getProductType());
//				productList.add(productDataBean);
//			}
//		}
//		
//		mv = new ModelAndView();
//		mv.addObject("productsData", productList);
//		mv.setViewName("homepage");
//		return mv;
//	}
	
	@GetMapping({"/home","/"})
	public ModelAndView directHomePage() {
		logger.info("-------Controller called");
		ModelAndView mv = null;
		try {
			mv = new ModelAndView();
			mv.setViewName("homepage");
		} catch (Exception e) {
			logger.error("----Error occurred during home page loading..."+e.getMessage());
		}
		
		return mv;
	}
}
