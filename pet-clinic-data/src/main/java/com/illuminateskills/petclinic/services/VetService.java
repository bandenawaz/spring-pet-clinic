package com.illuminateskills.petclinic.services;

import java.util.Set;

import com.illuminateskills.petclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long>{
	
	Vet findById(Long id);
	

}
