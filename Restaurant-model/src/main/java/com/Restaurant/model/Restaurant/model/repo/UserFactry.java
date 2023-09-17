package com.Restaurant.model.Restaurant.model.repo;

import com.Restaurant.model.Restaurant.model.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class UserFactry {
    @Bean

    public List<User>getUserList(){
        return new ArrayList<>() ;
    }



}
