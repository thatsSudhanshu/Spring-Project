package com.sudhanshu.Citizen.CitizenRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sudhanshu.Citizen.model.Parts;
@Repository
public interface PartsRepo extends CrudRepository<Parts , Integer> {
	
}
