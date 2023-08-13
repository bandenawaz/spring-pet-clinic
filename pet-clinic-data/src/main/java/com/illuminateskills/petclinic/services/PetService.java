package com.illuminateskills.petclinic.services;

import com.illuminateskills.petclinic.model.Pet;
import java.util.Set;


public interface PetService {

    Pet findByLastName(String lastName);

    Pet save(Pet owner);

    Set<Pet> findAll();
    }