package org.shravan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api/car/v1/get")
public class Apitest {
    @Autowired
    @Qualifier("blue")
   car object;

    @GetMapping("api/getMyBean")
    public car getObject(){

        return  object;
    }


}
