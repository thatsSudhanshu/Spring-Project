package com.sudhanshu.Citizen.CitizenRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sudhanshu.Citizen.model.Citizen;
@Repository
public interface CitizenRepository extends CrudRepository< Citizen , Integer>{
	
}
