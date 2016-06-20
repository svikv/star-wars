package com.softserve.starwars.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Handles and retrieves planet request
 * @author Viktor Somka
 */

@Controller
@RequestMapping(value = "categories/films")
public class FilmsController {

    @RequestMapping(method = RequestMethod.GET)
    public String filmsPage(Model model) {

        return "films";
    }
}
