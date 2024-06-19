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

import com.sudhanshu.Citizen.CitizenService.PartsService;
import com.sudhanshu.Citizen.model.Parts;

@RestController
@CrossOrigin(allowedHeaders="*",origins="*")
public class PartsController {
	@Autowired
	private PartsService partsService;
	@PostMapping("/registerParts")
	public Parts registerCitizen(@RequestBody Parts parts) {
		return partsService.registerParts(parts);
	}
	@GetMapping("/getParts")
	public List<Parts> getParts(){
		return partsService.getParts();
	}
	@DeleteMapping("/deleteParts")
	public void deleteParts(@RequestParam Integer id)
	{
		partsService.deleteParts(id);
	}
	
	@PutMapping("/updateParts")
	public Parts updateParts(@RequestBody Parts parts) {
		return partsService.updateParts(parts);
	}

}
