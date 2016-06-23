package com.softserve.starwars.controller;

import com.softserve.starwars.Service.ExecuteRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Random;

@Controller
@RequestMapping(value = "categories/people")
public class PeopleController {

    private static final String PEOPLE_OBJECT = "peopleObject";
    private static final String ID = "id";
    final static int MIN = 1;
    final static int MAX = 100;

    @Autowired
    private ExecuteRequestService executeRequestService;

    @RequestMapping(produces = "application/json", method = RequestMethod.GET)
    public String getPeopleAsString() {

        return "people";
    }
}