package com.boot.dasboot.services;

import java.util.List;

import com.boot.dasboot.beans.BikeBeans;
import com.boot.dasboot.model.Bike;

public interface IBikeService {

	public List<BikeBeans> getAllBikes();
	public void create(Bike bike);
	public BikeBeans getBike(Long Id);
}
