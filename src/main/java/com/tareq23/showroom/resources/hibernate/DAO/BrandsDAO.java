package com.tareq23.showroom.resources.hibernate.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tareq23.showroom.resources.hibernate.entities.BrandEntity;

public class BrandsDAO {
	
	SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(BrandEntity.class)
									.buildSessionFactory();
	

	@SuppressWarnings("deprecation")
	public List<BrandEntity> getBrands() {
		
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<BrandEntity> list = session.createQuery("from brands").getResultList();
		return list;
	}

	@SuppressWarnings("deprecation")
	public void addBrand(BrandEntity brand) {
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		session.save(brand);
		session.getTransaction().commit();
		
	}

	public void deleteBrand(int brandId) {
		
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		BrandEntity brand =  session.get(BrandEntity.class, brandId);
		session.delete(brand);
		session.getTransaction().commit();
		
	}

	public void updateBrand(BrandEntity updatedBrand) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		BrandEntity brand = session.get(BrandEntity.class,updatedBrand.getBrandId());
		brand.setBrandName(updatedBrand.getBrandName());
		session.getTransaction().commit();
	}

}
