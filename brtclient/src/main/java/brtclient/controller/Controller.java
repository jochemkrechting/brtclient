package brtclient.controller;

import brtclient.entity.InrichtingselementCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Controller implements ApplicationRunner {

  private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);
  private static final String URL = "https://brt.basisregistraties.overheid.nl/api/v2";
  private static final String APIKEY = "9d4de0f-9ea9-4fb2-8a5d-b1371424ee4e";

  private final RestTemplate restTemplate;

  @Autowired
  public Controller(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  public void run(ApplicationArguments args) {

    HttpHeaders headers = new HttpHeaders();

    headers.set("X-Api-Key", APIKEY);
//    headers.set("Accept-Crs", "epsg:4258");
//    headers.set("Content-Crs", "epsg:4258");

    HttpEntity<?> requestHeader = new HttpEntity<>(headers);

    ResponseEntity<InrichtingselementCollection> response = restTemplate.exchange(URL +
        "/inrichtingselementen", HttpMethod.GET, requestHeader, InrichtingselementCollection.class);

    LOGGER.info("Status code: {}", response.getStatusCodeValue());
    LOGGER.info("Location: {}", response.getHeaders().getLocation());

  }

}
