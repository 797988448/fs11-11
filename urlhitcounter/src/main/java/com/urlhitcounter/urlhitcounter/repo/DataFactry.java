package com.urlhitcounter.urlhitcounter.repo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


public class DataFactry {

    private Map<String, Object> data = new HashMap<>();

    public DataFactry(String key, Object value) {
        data.put(key, value);
    }

    public DataFactry(String key1, Object value1, String key2, Object value2) {
        data.put(key1, value1);
        data.put(key2, value2);
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}

