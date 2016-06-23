package com.softserve.starwars.Service;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.softserve.starwars.dto.PeopleDTO;
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

    public Object parseAndWrite(String url, Category<?> category){

        String responseBody = executeRequestService.executeRequest(url);
        ObjectMapper mapper = new ObjectMapper();
        String name = category.getValue().getClass().getSimpleName();

        if(name.equals("PlanetDTO")){

            PlanetDTO object = null;
            try {
                object = mapper.readValue(responseBody, PlanetDTO.class);
            } catch (JsonGenerationException e) {
                LOGGER.error("Exception occurred during JSON generating for PlanetDTO.class " + e.getMessage(), e);
            } catch (JsonMappingException e) {
                LOGGER.error("Exception occurred during JSON mapping PlanetDTO.class " + e.getMessage(), e);
            } catch (IOException e) {
                LOGGER.error("Can't create planetDTO " + e.getMessage(), e);
            }
            return object;
        }

        else if(name.equals("PeopleDTO")){

            PeopleDTO object = null;
            try {
                object = mapper.readValue(responseBody, PeopleDTO.class);
            } catch (JsonGenerationException e) {
                LOGGER.error("Exception occurred during JSON generating PeopleDTO.class " + e.getMessage(), e);
            } catch (JsonMappingException e) {
                LOGGER.error("Exception occurred during JSON mapping PeopleDTO.class " + e.getMessage(), e);
            } catch (IOException e) {
                LOGGER.error("Can't create peopleDTO. " + e.getMessage(), e);
            }
            return object;
        }

        return null;
    }
}
