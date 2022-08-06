package com.foodmenu.springbootfoodimages.service.copy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodmenu.springbootfoodimages.entity.copy.DeliveryDetails;
import com.foodmenu.springbootfoodimages.repositary.copy.DeliveryDetailsRepository;

@Service
public class DeliveryDetailsService {
	
	@Autowired
	private DeliveryDetailsRepository deliveryDetailsRepository;
	
	public List<DeliveryDetails> getAllDeliveryDetails() {
		return deliveryDetailsRepository.findAll();
	}


}
