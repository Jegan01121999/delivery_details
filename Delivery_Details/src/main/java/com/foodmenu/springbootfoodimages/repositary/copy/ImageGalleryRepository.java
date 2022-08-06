package com.foodmenu.springbootfoodimages.repositary.copy;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodmenu.springbootfoodimages.entity.copy.ImageGallery;

@Repository
public interface ImageGalleryRepository extends JpaRepository<ImageGallery, Long>{

}