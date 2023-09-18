package com.urlhitcounter.urlhitcounter.controller;

import com.urlhitcounter.urlhitcounter.repo.DataFactry;
import com.urlhitcounter.urlhitcounter.service.ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private ServiceData urlHitService;

    @GetMapping("count")
    public DataFactry getHitCount() {
        int count = urlHitService.getHitCount();
        return new DataFactry("visitors", count);
    }

    @GetMapping("username/{username}/count")
    public DataFactry getUserHitCount(@PathVariable String username) {
        urlHitService.incrementHitCount(username);
        int count = urlHitService.getUserHitCount(username);
        return new DataFactry("username", username, "hitcount", count);
    }
}
