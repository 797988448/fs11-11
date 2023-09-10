package org.shravan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ObjectFactory {
//    @Configuration
//    public class ObjectFactory {

    public ObjectFactory() {

        System.out.println("configuration does create object as well!!!!");
    }

    @Bean("blue")
    public car createBlueCar() {
        System.out.println("testing configuration class methods!!!!!!");
        return new car("Blue");
    }
}