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

import com.sudhanshu.Citizen.CitizenService.CatalogService;
import com.sudhanshu.Citizen.model.Catalog;

@RestController
@CrossOrigin(allowedHeaders="*",origins="*")
public class CatalogController {
	@Autowired
	private CatalogService catalogService;
	@PostMapping("/registerCatalog")
	public Catalog registerCatalog(@RequestBody Catalog catalog) {
		return catalogService.registerCatalog(catalog);
	}
	@GetMapping("/getCatalogs")
	public List<Catalog> getCatalog(){
		return catalogService.getCatalogs();
	}
	@DeleteMapping("/deleteCatalog")
	public void deleteCatalog(@RequestParam Integer id)
	{
		catalogService.deleteCatalog(id);
	}
	
	@PutMapping("/updateCatalog")
	public Catalog updateCitizen(@RequestBody Catalog catalog) {
		return catalogService.updateCatalog(catalog);
	}
}
