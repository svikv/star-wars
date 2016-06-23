package service;

import com.softserve.starwars.Service.ExecuteRequestService;
import com.softserve.starwars.Service.GenerateRandomIdService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/root-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class ExecuteRequestServiceTest {

    @Autowired
    private ExecuteRequestService executeRequestService;

    @Autowired
    private GenerateRandomIdService generateRandomIdService;

    @Test
    public void executeRequestTest() {

        String responseExpected = "{\n" +
                "\t\"name\": \"Tatooine\",\n" +
                "\t\"rotation_period\": \"23\",\n" +
                "\t\"orbital_period\": \"304\",\n" +
                "\t\"diameter\": \"10465\",\n" +
                "\t\"climate\": \"arid\",\n" +
                "\t\"gravity\": \"1 standard\",\n" +
                "\t\"terrain\": \"desert\",\n" +
                "\t\"surface_water\": \"1\",\n" +
                "\t\"population\": \"200000\",\n" +
                "\t\"residents\": [\n" +
                "\t\t\"http://swapi.co/api/people/1/\",\n" +
                "\t\t\"http://swapi.co/api/people/2/\",\n" +
                "\t\t\"http://swapi.co/api/people/4/\",\n" +
                "\t\t\"http://swapi.co/api/people/6/\",\n" +
                "\t\t\"http://swapi.co/api/people/7/\",\n" +
                "\t\t\"http://swapi.co/api/people/8/\",\n" +
                "\t\t\"http://swapi.co/api/people/9/\",\n" +
                "\t\t\"http://swapi.co/api/people/11/\",\n" +
                "\t\t\"http://swapi.co/api/people/43/\",\n" +
                "\t\t\"http://swapi.co/api/people/62/\"\n" +
                "\t],\n" +
                "\t\"films\": [\n" +
                "\t\t\"http://swapi.co/api/films/5/\",\n" +
                "\t\t\"http://swapi.co/api/films/4/\",\n" +
                "\t\t\"http://swapi.co/api/films/6/\",\n" +
                "\t\t\"http://swapi.co/api/films/3/\",\n" +
                "\t\t\"http://swapi.co/api/films/1/\"\n" +
                "\t],\n" +
                "\t\"created\": \"2014-12-09T13:50:49.641000Z\",\n" +
                "\t\"edited\": \"2014-12-21T20:48:04.175778Z\",\n" +
                "\t\"url\": \"http://swapi.co/api/planets/1/\"\n" +
                "}";

        String responseResult = "";
        responseResult = executeRequestService.executeRequest("http://swapi.co/api/planets/1/");
        System.out.println(responseResult);
        assertEquals(responseExpected, responseResult);
    }
}


