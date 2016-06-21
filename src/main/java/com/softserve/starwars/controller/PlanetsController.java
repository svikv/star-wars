package com.softserve.starwars.controller;

import com.softserve.starwars.Service.ExecuteRequestService;
import com.softserve.starwars.dto.PlanetResultObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Random;

@Controller
@RequestMapping(value = "/categories/planets")
public class PlanetsController {

    private static final String PLANET_OBJECT = "planetObject";
    private static final String ID = "id";
    final static int MIN = 1;
    final static int MAX = 100;

    @Autowired
    private ExecuteRequestService executeRequestService;

    @RequestMapping(produces = "application/json", method = RequestMethod.GET)
    public String getPlanetAsString() {

        Random random = new Random();
        int id  = random.nextInt(MAX-MIN) + MIN;
        String url = "http://swapi.co/api/planets/"+id;
        String responseBody = executeRequestService.executeRequest(url);
        return "redirect:/categories/planets/planet/"+id;
    }

    @RequestMapping(value = "/planet/{id}", consumes = "application/json", method = RequestMethod.GET)
    public String getPlanet(@RequestBody PlanetResultObject planetObject, @PathVariable(value = "id") int id, Model model) {

        model.addAttribute(PLANET_OBJECT, planetObject);
        model.addAttribute(ID, id);
        return "planets";
    }
}