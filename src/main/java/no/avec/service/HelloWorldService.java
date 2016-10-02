package no.avec.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by avec on 30/09/2016.
 */
@Service
public class HelloWorldService {
    @PostConstruct
    public void init() {
        System.out.println("Hello World!");
    }
}
