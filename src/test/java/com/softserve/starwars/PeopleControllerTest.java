package com.softserve.starwars;

import com.softserve.starwars.Service.ExecuteRequestService;
import com.softserve.starwars.controller.PeopleController;
import com.softserve.starwars.dto.PeopleResultObject;
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
 *  Unit testing of PeopleController class with mock objects
 */
@RunWith(MockitoJUnitRunner.class)
public class PeopleControllerTest {

    private static final int ID = 1;
    private static final int ONCE = 1;

    @Mock
    private ExecuteRequestService executeRequestService;

    @InjectMocks
    PeopleController peopleController;

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
    PeopleResultObject peopleObject = new PeopleResultObject();

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getPeopleAsStringTest() {

        String expected = "redirect:/categories/people/person/";
        String responseBody = "";
        String url = "";

        when(executeRequestService.executeRequest(url)).thenReturn(responseBody);
        assertEquals(peopleController.getPeopleAsString(), expected);
        verify(executeRequestService, times(ONCE)).executeRequest(url);
    }

    @Test
    public void getPeopleTest() {

        String expected = "people";
        assertEquals(peopleController.getPeople(peopleObject, ID, model), expected);
    }
}
