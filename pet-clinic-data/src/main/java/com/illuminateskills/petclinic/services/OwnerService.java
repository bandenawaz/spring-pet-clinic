package com.illuminateskills.petclinic.services;

import com.illuminateskills.petclinic.model.Owner;

import java.util.List;
import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    //Owner findById(Long id);

    Owner findByLastName(String lastName);

   // List<Owner> findAllByLastNameLike(String lastName);

}