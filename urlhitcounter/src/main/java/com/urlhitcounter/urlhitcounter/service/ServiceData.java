package com.urlhitcounter.urlhitcounter.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Component
//@Service
public class ServiceData {
    private int totalCount = 0;

    // Store user hit counts in a map
    private Map<String, Integer> userHitCounts = new HashMap<>();

    public int getHitCount() {
        totalCount++;
        return totalCount;
    }

    public int getUserHitCount(String username) {
        return userHitCounts.getOrDefault(username, 0);
    }

    public void  incrementHitCount() {

         totalCount++;
         //return totalCount;
    }

    public void incrementHitCount(String username) {
        userHitCounts.put(username, userHitCounts.getOrDefault(username, 0) + 1);
    }
}
