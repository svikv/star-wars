package com.softserve.starwars.controller;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.softserve.starwars.Service.ExecuteRequestService;
import com.softserve.starwars.Service.GenerateRandomUrlService;
import com.softserve.starwars.Service.ParseAndWriteService;
import com.softserve.starwars.dto.PlanetDTO;
import org.apache.http.protocol.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URL;
import java.util.Random;

@Controller
@SessionAttributes("responseBody")
@RequestMapping(value = "/categories/planets")
public class PlanetsController {

    private static final String PLANET = "planet";
    private static final String RESPONSE_BODY = "responseBody";
    private static final String ID = "id";
    final static int MIN = 1;
    final static int MAX = 61;

    @Autowired
    private ParseAndWriteService parseAndWriteService;

    @Autowired
    private GenerateRandomUrlService generateRandomUrlService;

    @RequestMapping(method = RequestMethod.GET)
    public String getPlanet(Model model) {

        String url = generateRandomUrlService.generateRandomUrl(MIN, MAX);
        PlanetDTO planet = parseAndWriteService.parseAndWrite(url);
        model.addAttribute(PLANET, planet);
        model.addAttribute(ID, "id");
        return "planets";
    }
}