package com.softserve.starwars.Service;

import com.softserve.creditloan.dao.ClientDAO;
import com.softserve.creditloan.model.Client;
import com.sun.deploy.net.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.net.www.http.HttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

@Service
public class ExecuteRequestService {

    private static final Logger LOGGER = Logger.getLogger(ExecuteRequestService.class);

    public void executeRequest() throws ClientProtocolException, IOException {

        String url = "https://swapi.co/";
        HttpClient client = new HttpClient();
        HttpGet request = new HttpGet(url);
        HttpResponse response = client.execute(request);

        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        String line = "";
        while ((line = rd.readLine()) != null) {
            System.out.println(line);
        }
    }
}
