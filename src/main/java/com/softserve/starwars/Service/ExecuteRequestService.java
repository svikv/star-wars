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