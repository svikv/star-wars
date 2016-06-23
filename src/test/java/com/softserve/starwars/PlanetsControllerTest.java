package com.softserve.starwars.controller;

import com.softserve.starwars.Service.GenerateRandomUrlService;
import com.softserve.starwars.Service.ParseAndWriteService;
import com.softserve.starwars.controller.PlanetsController;
import com.softserve.starwars.dto.PlanetDTO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.ui.Model;

import java.util.Collection;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

/**
 *  Unit testing of PlanetsController class with mock objects
 */
@RunWith(MockitoJUnitRunner.class)
public class PlanetsControllerTest {

    private static final int ONCE = 1;
    private static final int MIN = 1;
    private static final int MAX = 61;

    @Mock
    private ParseAndWriteService parseAndWriteService;

    @Mock
    private GenerateRandomUrlService generateRandomUrlService;

    @InjectMocks
    PlanetsController planetsController;

    Model model = new Model() {
        @Override
        public Model addAttribute(String s, Object o) {
            return null;
        }

        @Override
        public Model addAttribute(Object o) {
            return null;
        }

        @Override
        public Model addAllAttributes(Collection<?> collection) {
            return null;
        }

        @Override
        public Model addAllAttributes(Map<String, ?> map) {
            return null;
        }

        @Override
        public Model mergeAttributes(Map<String, ?> map) {
            return null;
        }

        @Override
        public boolean containsAttribute(String s) {
            return false;
        }

        @Override
        public Map<String, Object> asMap() {
            return null;
        }
    };
    PlanetDTO planetObject = new PlanetDTO();

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getPlanetTest() {

        String expected = "planets";
        PlanetDTO planetDTO = new PlanetDTO();
        String url = "";

        when(generateRandomUrlService.generateRandomUrl(MIN, MAX)).thenReturn(url);
        when(parseAndWriteService.parseAndWrite(url)).thenReturn(planetDTO);
        assertEquals(planetsController.getPlanet(model), expected);
        verify(generateRandomUrlService, times(ONCE)).generateRandomUrl(MIN, MAX);
        verify(parseAndWriteService, times(ONCE)).parseAndWrite(url);
    }
}