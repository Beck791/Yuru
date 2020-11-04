package com.yurucamp.car.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Car")
public class CarController {

	@GetMapping("/Index")
	public String carIndex() {
		return "Car/carIndex";
	}
}
