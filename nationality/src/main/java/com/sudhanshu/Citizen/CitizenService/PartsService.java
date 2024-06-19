package com.sudhanshu.Citizen.CitizenService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sudhanshu.Citizen.CitizenRepository.PartsRepo;
import com.sudhanshu.Citizen.model.Parts;
@Service
public class PartsService {
	@Autowired
	PartsRepo partsRepo;
	public Parts registerParts(Parts parts) {
		return partsRepo.save(parts);
	}
	public List<Parts> getParts(){
		return (List<Parts>)partsRepo.findAll();
	}
	
	public void deleteParts(Integer id) {
		partsRepo.deleteById(id);
	}
	public Parts updateParts(Parts parts) {
		Integer pid = parts.getPid();
		Parts newParts = partsRepo.findById(pid).get();
		newParts.setPname(parts.getPname());
		newParts.setColor(parts.getColor());
		return partsRepo.save(newParts);
		
	}
}
