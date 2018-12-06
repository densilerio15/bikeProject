package com.boot.dasboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.boot.dasboot.beans.BikeBeans;
import com.boot.dasboot.model.Bike;
import com.boot.dasboot.services.IBikeService;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {
	
	@Autowired
	private IBikeService bikeService;
	
	@GetMapping
	public List<BikeBeans> list(){
		return bikeService.getAllBikes();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody Bike bike) {
		bikeService.create(bike);
	}
	
	@GetMapping("/{id}")
	public BikeBeans get(@PathVariable("id") long id) {
		return bikeService.getBike(id);
	}
}
