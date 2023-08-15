package com.illuminateskills.petclinic.controllers;

import com.illuminateskills.petclinic.model.Person;
import com.illuminateskills.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService<Person, Number> ownerService;

    public OwnerController(OwnerService<Person, Number> ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String listOwners(Model model){

        model.addAttribute("owners",ownerService.findAll());
        return "owners/index";
    }
}
