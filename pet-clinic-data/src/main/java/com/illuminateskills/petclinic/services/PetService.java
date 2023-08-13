package com.illuminateskills.petclinic.services;

import com.illuminateskills.petclinic.model.Pet;
import java.util.Set;


public interface PetService extends CrudService<Pet, Long>{

    Pet findByLastName(String lastName);

    }