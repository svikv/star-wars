package com.softserve.starwars.Service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GenerateRandomUrlService {

    public String generateRandomUrl(int min, int max){

        Random random = new Random();
        int id  = random.nextInt(max-min) + min;
        return "http://swapi.co/api/planets/"+id+"/";
    }
}
