package com.tareq23.showroom.resources;

import java.util.List;



import com.tareq23.showroom.resources.hibernate.entities.BrandEntity;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/showroom")
public class Brands {
	
	BrandService brandService = new BrandService();
	
	@GET
	@Path("/brands")
	@Produces(MediaType.APPLICATION_JSON)
	public List<BrandEntity> getBrands()
	{
		List<BrandEntity> listBrands = brandService.getBrands();
		return listBrands;
	}
	
	@POST
	@Path("/brands")
	@Consumes(MediaType.APPLICATION_JSON)
	public void postBrand(BrandEntity brand) {
		brandService.addBrand(brand);
	}
	
	@PUT
	@Path("/brands/{brandId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void putBrand(@PathParam("brandId") int brandId, BrandEntity updatedBrand) {
		updatedBrand.setBrandId(brandId);
		brandService.updateBrand(updatedBrand);
	}
	
	@DELETE
	@Path("/brands/{brandId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteBrand(@PathParam("brandId") int brandId, BrandEntity deletedBrand)
	{
		brandService.deleteBrand(brandId);
	}
}
