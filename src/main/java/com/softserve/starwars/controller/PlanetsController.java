package com.softserve.starwars.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "categories/planets")
public class PlanetsController {

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    String planetsPage(Model model) {



        return "planet";
    }
}