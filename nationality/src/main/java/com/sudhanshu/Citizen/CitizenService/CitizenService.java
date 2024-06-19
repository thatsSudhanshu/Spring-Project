package com.sudhanshu.Citizen.CitizenService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudhanshu.Citizen.CitizenRepository.CitizenRepository;
import com.sudhanshu.Citizen.model.Citizen;
@Service
public class CitizenService {
	@Autowired
	CitizenRepository citizenRepository;
	public Citizen registerCitizen(Citizen citizen) {
		return citizenRepository.save(citizen);
	}
	public List<Citizen> getCitizens(){
		return (List<Citizen>)citizenRepository.findAll();
	}
	
	public void deleteCitizen(Integer id) {
		citizenRepository.deleteById(id);
	}
	public Citizen updateCitizen(Citizen citizen) {
		Integer rollno = citizen.getRollno();
		Citizen newCitizen = citizenRepository.findById(rollno).get();
		newCitizen.setName(citizen.getName());
		newCitizen.setCountry(citizen.getCountry());
		return citizenRepository.save(newCitizen);
		
	}
}
