package com.econetmedia.developer.interview.rest;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by kennympariwa on 10/24/17.
 */
@Service
public class RestConsumerImpl implements RestConsumer {

    @Override
    public SampleRestObject makeRestCall(int postId){
        RestTemplate restTemplate= new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>("", headers);

        return  restTemplate.exchange("https://jsonplaceholder.typicode.com/posts/{postId}", HttpMethod.GET, entity,
                new ParameterizedTypeReference<SampleRestObject>() {
                }, postId).getBody();
    }
}
