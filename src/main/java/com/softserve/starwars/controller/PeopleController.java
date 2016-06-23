package com.softserve.starwars.controller;

import com.softserve.starwars.Service.GenerateRandomIdService;
import com.softserve.starwars.Service.ParseAndWriteService;
import com.softserve.starwars.Service.Category;
import com.softserve.starwars.dto.PeopleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "categories/people")
public class PeopleController {

    private static final String PEOPLE = "people";
    final static int MIN = 1;
    final static int MAX = 88;

    @Autowired
    private ParseAndWriteService parseAndWriteService;

    @Autowired
    private GenerateRandomIdService generateRandomIdService;

    @RequestMapping(method = RequestMethod.GET)
    public String getPlanet(Model model) {

        int id = generateRandomIdService.generateRandomId(MIN, MAX);
        String url = "http://swapi.co/api/people/"+id+"/";

        Category<PeopleDTO> category = new Category<>(new PeopleDTO());
        PeopleDTO people = (PeopleDTO) parseAndWriteService.parseAndWrite(url, category);
        model.addAttribute(PEOPLE, people);
        model.addAttribute("id", id);
        return "people";
    }
}