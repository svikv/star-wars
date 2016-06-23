package com.softserve.starwars.Service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GenerateRandomIdService {

    public int generateRandomId(int min, int max){

        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
