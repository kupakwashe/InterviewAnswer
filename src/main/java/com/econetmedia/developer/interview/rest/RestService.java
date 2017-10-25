package com.econetmedia.developer.interview.rest;

import com.econetmedia.developer.interview.model.Address;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by kennympariwa on 10/25/17.
 */
@RestController
@RequestMapping("/api")
public class RestService {

    @Autowired
    RestConsumer restConsumer;

    private static final Logger logger= LoggerFactory.getLogger(RestService.class);

    @PostMapping(value = "/display/myAddress", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity displayMyAddress(@RequestBody Address address) {
        logger.info("This is my address:::::::"+address.toString());
        logger.info("My object:::::::"+restConsumer.makeRestCall(1).toString());
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
