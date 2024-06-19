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
import com.sudhanshu.Citizen.CitizenService.SupplierService;

import com.sudhanshu.Citizen.model.Supplier;

@RestController
@CrossOrigin(allowedHeaders="*",origins="*")
public class SupplierController{
	@Autowired
	private SupplierService supplierService;
	@PostMapping("/registerSupplier")
	public Supplier registerSupplier(@RequestBody Supplier supplier) {
		return supplierService.registerSupplier(supplier);
	}
	@GetMapping("/getSuppliers")
	public List<Supplier> getSuppliers(){
		return supplierService.getSuppliers();
	}
	@DeleteMapping("/deleteSupplier")
	public void deleteSupplier(@RequestParam Integer id)
	{
		supplierService.deleteSupplier(id);
	}
	
	@PutMapping("/updateSupplier")
	public Supplier updateSupplier(@RequestBody Supplier supplier) {
		return supplierService.updateSupplier(supplier);
	}
}
