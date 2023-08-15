package com.illuminateskills.petclinic.services;

import com.illuminateskills.petclinic.model.Owner;
import com.illuminateskills.petclinic.model.Person;

public interface OwnerService<O extends Person, L extends Number> extends CrudService<Owner, Long>{

    //Owner findById(Long id);

    Owner findByLastName(String lastName);

   // List<Owner> findAllByLastNameLike(String lastName);

}