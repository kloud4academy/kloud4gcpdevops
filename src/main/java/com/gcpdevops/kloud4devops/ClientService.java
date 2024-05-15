package com.gcpdevops.kloud4devops;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.ProductEntity;
import repository.ProductRepository;

@Service
public class ClientService {

//	Logger logger = LoggerFactory.getLogger(ClientService.class);
	//@Autowired
	private ProductRepository productRepository;
	
	public List<model.ProductEntity> fetchProductsByCategory(String category) {
		List<ProductEntity> productList = null;
		try {
			productList = productRepository.findAll(category);
		} catch (Exception e) {
			e.printStackTrace();
			//logger.error("Exception occurred during product fetching in mongodb in fetchProductsByCategory");
		}
		
//		if(productList == null || productList.isEmpty()) {
//			productList = productRepository.findAll("Fresh");
//		}
		return productList;
	}
	
}
