package com.softserve.starwars.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "categories/people")
public class PeopleController {

    @RequestMapping(method = RequestMethod.GET)
    public String peoplePage(Model model) {

        return "people";
    }
}
