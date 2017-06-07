package com.chen.cloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by chen on 17-6-7.
 */
@RestController
@RequestMapping("/api")
public class LoadController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("input")
    public String input(String servicename){
        String uri = String.format("http://%s/hi",servicename);
        return restTemplate.getForObject(uri,String.class);
    }

}
