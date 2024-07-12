package com.air.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.air.entity.FlightData;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("/airline")
public class AirController {
	
	
	
	@GetMapping("/getFlights")
	public List<FlightData> getData() {
		
	List<FlightData> fd = new ArrayList<FlightData>();
	
	fd.add(new FlightData("N/A", null, "53500", "189", null, null, "KLM"));
	fd.add(new FlightData("144600", "177", "55200", "158", null, null, "Qantas"));
	
	return fd;
	}

}
