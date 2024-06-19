package com.sudhanshu.Citizen.CitizenService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudhanshu.Citizen.CitizenRepository.SupplierRepo;
import com.sudhanshu.Citizen.model.Supplier;
@Service
public class SupplierService {
	@Autowired
	SupplierRepo supplierRepo;
	public Supplier registerSupplier(Supplier supplier) {
		return supplierRepo.save(supplier);
	}
	public List<Supplier> getSuppliers(){
		return (List<Supplier>)supplierRepo.findAll();
	}
	
	public void deleteSupplier(Integer id) {
		supplierRepo.deleteById(id);
	}
	public Supplier updateSupplier(Supplier supplier) {
		Integer sid = supplier.getSid();
		Supplier newSupplier = supplierRepo.findById(sid).get();
		newSupplier.setSname(supplier.getSname());
		newSupplier.setAddress(supplier.getAddress());
		return supplierRepo.save(newSupplier);
		
	}
}
