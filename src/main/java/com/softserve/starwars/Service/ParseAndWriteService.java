package com.softserve.starwars.Service;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.softserve.starwars.dto.PlanetDTO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ParseAndWriteService {

    private static final Logger LOGGER = Logger.getLogger(ParseAndWriteService.class);

    @Autowired
    private ExecuteRequestService executeRequestService;

    public PlanetDTO parseAndWrite(String url){

        String responseBody = executeRequestService.executeRequest(url);

        ObjectMapper mapper = new ObjectMapper();
        PlanetDTO planet = null;
        try {
            planet = mapper.readValue(responseBody, PlanetDTO.class);
        } catch (JsonGenerationException e) {
            LOGGER.error("Exception occurred during JSON generating. " + e.getMessage(), e);

        } catch (JsonMappingException e) {
            LOGGER.error("Exception occurred during JSON mapping. " + e.getMessage(), e);
        } catch (IOException e) {
            LOGGER.error("Can't create planetResultObject. " + e.getMessage(), e);
        }
        return planet;
    }
}
