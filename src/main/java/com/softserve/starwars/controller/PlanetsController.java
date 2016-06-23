package com.softserve.starwars.controller;

import com.softserve.starwars.Service.GenerateRandomIdService;
import com.softserve.starwars.Service.ParseAndWriteService;
import com.softserve.starwars.Service.Category;
import com.softserve.starwars.dto.PlanetDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping(value = "/categories/planets")
public class PlanetsController {

    private static final String PLANET = "planet";
    final static int MIN = 1;
    final static int MAX = 61;

    @Autowired
    private ParseAndWriteService parseAndWriteService;

    @Autowired
    private GenerateRandomIdService generateRandomIdService;

    @RequestMapping(method = RequestMethod.GET)
    public String getPlanet(Model model) {

        int id = generateRandomIdService.generateRandomId(MIN, MAX);
        String url = "http://swapi.co/api/planets/"+id+"/";

        Category<PlanetDTO> category = new Category<>(new PlanetDTO());
        PlanetDTO planet = (PlanetDTO) parseAndWriteService.parseAndWrite(url, category);
        model.addAttribute(PLANET, planet);
        model.addAttribute("id", id);
        return "planets";
    }
}