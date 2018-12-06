package com.boot.dasboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dasboot.beans.BikeBeans;
import com.boot.dasboot.model.Bike;
import com.boot.dasboot.repositories.BikeRepository;

@Service
public class BikeServiceImpl implements IBikeService{

	@Autowired
	private BikeRepository bikeRepository;
	
	@Override
	public List<BikeBeans> getAllBikes() {
		List<Bike> bikes = bikeRepository.findAll();
		List<BikeBeans> bikeBean = new ArrayList<>();
		for(Bike bike:bikes) {
			bikeBean.add(
					new BikeBeans(bike.getId() , bike.getName(),bike.getEmail(), bike.getPhone() ,
							bike.getModel(), bike.getSerialNumber() , bike.getPurchasePrice() , bike.getPurchaseDate() , bike.isContact())
					);
			
		}
		return bikeBean;
	}

	@Override
	public void create(Bike bike) {
		bikeRepository.save(bike);
		
	}

	@Override
	public BikeBeans getBike(Long id) {
		Bike bike =bikeRepository.getOne(id);
		return new BikeBeans(bike.getId() , bike.getName(),bike.getEmail(), bike.getPhone() ,
				bike.getModel(), bike.getSerialNumber() , bike.getPurchasePrice() , bike.getPurchaseDate() , bike.isContact());
		
	}

}
