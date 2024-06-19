
package com.sudhanshu.Citizen.CitizenRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sudhanshu.Citizen.model.Supplier;
@Repository
public interface SupplierRepo extends CrudRepository<Supplier , Integer> {
	
}
