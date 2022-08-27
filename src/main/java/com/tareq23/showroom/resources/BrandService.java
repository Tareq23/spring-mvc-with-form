package com.tareq23.showroom.resources;

import java.util.List;

import com.tareq23.showroom.resources.hibernate.DAO.BrandsDAO;
import com.tareq23.showroom.resources.hibernate.entities.BrandEntity;

public class BrandService {
	
	BrandsDAO DAO = new BrandsDAO();

	public List<BrandEntity> getBrands() {
		
		return DAO.getBrands();
	}

	public void addBrand(BrandEntity brand) {
		
		 DAO.addBrand(brand);
	}

	public void updateBrand(BrandEntity updatedBrand) {
		
		DAO.updateBrand(updatedBrand);
	}

	public void deleteBrand(int brandId) {
	
		DAO.deleteBrand(brandId);
		
	}


}
