package com.illuminateskills.petclinic.services.map;

import java.util.Set;

import com.illuminateskills.petclinic.model.Vet;
import com.illuminateskills.petclinic.services.CrudService;
import com.illuminateskills.petclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Set<Vet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	/*
	 * @Override Vet save(Long id, Vet object) { // TODO Auto-generated method stub
	 * return super.save(id, object); }
	 */

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Vet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}

}
