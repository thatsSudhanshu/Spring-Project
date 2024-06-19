package com.sudhanshu.Citizen.CitizenRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sudhanshu.Citizen.model.Catalog;
@Repository
public interface CatalogRepo extends CrudRepository< Catalog, Integer > {
	
}
