package com.foodmenu.springbootfoodimages.repositary.copy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodmenu.springbootfoodimages.entity.copy.DeliveryDetails;


@Repository
public interface DeliveryDetailsRepository extends JpaRepository<DeliveryDetails, Long>{

}

