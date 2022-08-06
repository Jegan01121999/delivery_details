package com.foodmenu.springbootfoodimages.controller.copy;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.foodmenu.springbootfoodimages.entity.copy.DeliveryDetails;
import com.foodmenu.springbootfoodimages.entity.copy.ImageGallery;
import com.foodmenu.springbootfoodimages.service.copy.DeliveryDetailsService;
import com.foodmenu.springbootfoodimages.service.copy.ImageGalleryService;

@Controller
public class DeliveryDetailsController {
	
	@Value("${uploadDir}")
	private String uploadFolder;

	@Autowired
	private DeliveryDetailsService deliverDetailsService;

	//private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/deliverydetails/show")
	String show(Model map) {
		List<DeliveryDetails> delivery = deliverDetailsService.getAllDeliveryDetails();
		map.addAttribute("delivery", delivery);
		return "delivery";

	}
}
