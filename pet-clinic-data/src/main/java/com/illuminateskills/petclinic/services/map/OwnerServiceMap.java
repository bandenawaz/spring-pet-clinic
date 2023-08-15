package com.illuminateskills.petclinic.services.map;

import java.util.Set;

import com.illuminateskills.petclinic.model.Owner;
import com.illuminateskills.petclinic.services.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService<Owner, Long> {

	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

/*	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}*/

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}


	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}
}
