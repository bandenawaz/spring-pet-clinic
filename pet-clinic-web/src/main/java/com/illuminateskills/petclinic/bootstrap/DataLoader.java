package com.illuminateskills.petclinic.bootstrap;

import com.illuminateskills.petclinic.model.Owner;
import com.illuminateskills.petclinic.model.Person;
import com.illuminateskills.petclinic.model.Vet;
import com.illuminateskills.petclinic.services.OwnerService;
import com.illuminateskills.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private  final OwnerService<Person, Number> ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService<Person, Number> ownerService, VetService vetService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {


        Owner owner1 = new Owner();
        //owner1.setId(1l);
        owner1.setFirstName("Micheal");
        owner1.setLastName("Meston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        //owner2.setId(2l);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        //vet1.setId(1l);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        //vet2.setId(2l);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded vets....");
    }
}
