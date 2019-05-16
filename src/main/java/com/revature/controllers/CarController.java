package com.revature.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Car;

@RestController
@RequestMapping("")
public class CarController {

	@PostMapping("")
	public Car createCar(@RequestBody @Valid Car car) {
		car.setId((int) (Math.random() * 100));
		return car;
	}
}
