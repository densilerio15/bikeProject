package com.boot.dasboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.boot.dasboot.model.Bike;


@Transactional
public interface BikeRepository extends JpaRepository<Bike, Long>  {

}
