package com.sudhanshu.Citizen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sudhanshu.Citizen.CitizenService.CitizenService;
import com.sudhanshu.Citizen.model.Citizen;
@RestController
@CrossOrigin(allowedHeaders="*",origins="*")
public class CitizenController {
	
	@Autowired
	private CitizenService citizenService;
	@PostMapping("/registerCitizen")
	public Citizen registerCitizen(@RequestBody Citizen citizen) {
		return citizenService.registerCitizen(citizen);
	}
	@GetMapping("/getCitizens")
	public List<Citizen> getCitizens(){
		return citizenService.getCitizens();
	}
	@DeleteMapping("/deleteCitizen")
	public void deleteCitizen(@RequestParam Integer id)
	{
		citizenService.deleteCitizen(id);
	}
	
	@PutMapping("/updateCitizen")
	public Citizen updateCitizen(@RequestBody Citizen citizen) {
		return citizenService.updateCitizen(citizen);
	}
}
