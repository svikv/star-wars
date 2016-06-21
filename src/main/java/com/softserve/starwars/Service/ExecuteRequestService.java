package com.softserve.starwars.Service;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Service responsible for executing request and formation String object
 * @author Viktor Somka
 */
@Service
public class ExecuteRequestService {

    private static final Logger LOGGER = Logger.getLogger(ExecuteRequestService.class);

    public String executeRequest(String url) {

        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {

            HttpGet request = new HttpGet(url);

            // Running request.
            try (CloseableHttpResponse response = httpClient.execute(request)) {

                String responseBody = "";
                String line = "";
                int statusCode = response.getStatusLine().getStatusCode();

                // If request's run success, try to get response body from response
                if ((statusCode >= 200) && (statusCode < 400)) {

                    HttpEntity entity = response.getEntity();
                    if (entity != null) {
                        InputStream inputStream = entity.getContent();
                        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

                        try {
                            while ((line = reader.readLine()) != null) {
                                responseBody += line;
                            }
                        } catch (IOException e) {
                            LOGGER.error("Can't read response body. " + e.getMessage(), e);
                        } finally {
                            reader.close();
                            inputStream.close();
                        }
                    }
                }
                return responseBody;
            } catch (IOException e) {
                LOGGER.error("Exception occurred during request sending. " + e.getMessage(), e);
            }
        } catch (IOException e) {
            LOGGER.error("Exception occurred during HttpClient creating. " + e.getMessage(), e);
        }
        return null;
    }
}




























/*public void executeRequest() throws ClientProtocolException, IOException {

        String urlString = "http://swapi.co/api/people/1";
        CloseableHttpClient client = HttpClientBuilder.create().build();

        HttpGet request = new HttpGet(urlString);
        HttpResponse response = (HttpResponse) client.execute(request);
        int statusCode = response.getStatusLine().getStatusCode();
        //HttpEntity entity = response.getEntity();

        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

        if ((statusCode >= 200) && (statusCode < 400)) {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                InputStream inputStream = entity.getContent();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                try {
                    String responseBody = reader.readLine();
                } catch (IOException e) {
                    LOGGER.error("Can't read response body. " + e.getMessage(), e);
                } finally {
                    reader.close();
                    inputStream.close();
                }
            }
        }


        String line = "";
        while ((line = rd.readLine()) != null) {
            System.out.println(line);

        HttpGet httppost = new HttpGet(params[0]);
        HttpClient httpclient = new DefaultHttpClient();
        HttpResponse response = httpclient.execute(httppost);

        int status = response.getStatusLine().getStatusCode();


        response = instance.execute(new HttpGet(SAMPLE_URL));
        try {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                InputStream instream = entity.getContent();
                instream.close();
            }
        } finally {
            response.close();
        }*/









/*String url = "https://swapi.co/";
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpEntity httpEntity = null;
        HttpResponse httpResponse = null;
        HttpGet request = new HttpGet(url);
        httpResponse = (HttpResponse) httpClient.execute(request);

        BufferedReader rd = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
        String line = "";
        while ((line = rd.readLine()) != null) {
            System.out.println(line);
        }*/

        /*CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(url);
        CloseableHttpResponse response = httpclient.execute(httpget);
        try {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                InputStream instream = entity.getContent();
                try {
                    // do something useful
                } finally {
                    instream.close();
                }
            }
        } finally {
            response.close();
        }*/

        /*HttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet(url);
        HttpResponse response = client.execute(request);

        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        String line = "";
        while ((line = rd.readLine()) != null) {
            System.out.println(line);
        }*/