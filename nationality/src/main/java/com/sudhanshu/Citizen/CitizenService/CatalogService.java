package com.sudhanshu.Citizen.CitizenService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudhanshu.Citizen.CitizenRepository.CatalogRepo;
import com.sudhanshu.Citizen.model.Catalog;



@Service
public class CatalogService {
	@Autowired
	CatalogRepo catalogRepo;
	public Catalog registerCatalog(Catalog catalog) {
		return catalogRepo.save(catalog);
	}
	public List<Catalog> getCatalogs(){
		return (List<Catalog>)catalogRepo.findAll();
	}
	
	public void deleteCatalog(Integer id) {
		catalogRepo.deleteById(id);
	}
	public Catalog updateCatalog(Catalog catalog) {
		Integer sid = catalog.getSid();
		Catalog newCatalog = catalogRepo.findById(sid).get();
		newCatalog.setPid(catalog.getPid());
		newCatalog.setCost(catalog.getCost());
		return catalogRepo.save(newCatalog);
		
	}
	
}
