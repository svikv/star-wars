package com.softserve.starwars.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "categories/species")
public class SpeciesController {

    @RequestMapping(method = RequestMethod.GET)
    public String speciesPage(Model model) {

        return "species";
    }
}
