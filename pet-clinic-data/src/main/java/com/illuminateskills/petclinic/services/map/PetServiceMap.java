package com.illuminateskills.petclinic.services.map;

import java.util.Set;

import com.illuminateskills.petclinic.model.Pet;
import com.illuminateskills.petclinic.services.CrudService;
import com.illuminateskills.petclinic.services.PetService;

public class PetServiceMap extends AbstractMapService<Pet,Long>  implements PetService {

	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	/*
	 * @Override Pet save(Long id, Pet object) { // TODO Auto-generated method stub
	 * return super.save(id, object); }
	 */

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Pet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}
	
	
	

}
