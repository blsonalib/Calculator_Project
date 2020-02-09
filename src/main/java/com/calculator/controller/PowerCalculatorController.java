package com.calculator.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.model.NumberDTO;
import com.calculator.service.CalculatorService;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RequestMapping("/calculator")
@RestController
public class PowerCalculatorController {
	@Autowired
	CalculatorService service;

	@PostMapping("/power")
	public int calculation(@RequestBody NumberDTO numberDTO) {
		System.out.println("in controller");

		int response = service.calculate(numberDTO);
		return response;
	}
}
