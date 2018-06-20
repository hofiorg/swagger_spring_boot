package org.hofi.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestExample {

  private static final Logger log = LoggerFactory.getLogger(RestExample.class);

  public static String makeRestRequest() {
    RestTemplate restTemplate = new RestTemplate();
    String fooResourceUrl = "http://localhost:9090/rest/foos";
    ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
    log.info(response.getBody());
    return response.getBody();
  }
}
