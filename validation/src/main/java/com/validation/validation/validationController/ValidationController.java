package com.validation.validation.validationController;

import com.validation.validation.model.Validation;
import com.validation.validation.validationservice.ValidationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ValidationController {

    @Autowired
    ValidationService validationService;
    @PostMapping("Validation")
    public String addStocks(@Valid  @RequestBody List<Validation> newvalidation)
    {
        return validationService.addStocks(newvalidation);
    }
@GetMapping("get/Id/{id}")
    public Validation getUserId( @PathVariable Integer id){
        return validationService.getUserId(id);
    }
@GetMapping("gets")
    public List<Validation>getAllUser(){
        return validationService.getAllUser();
    }
    @PutMapping("update/userName/id")
    public String updateStockByType(@RequestParam Integer id,@RequestParam String userName)
    {

        return validationService.updateStockByType(id,userName);
    }
    @DeleteMapping("remove/id/{id}")
    public String DeleteRoom(@PathVariable Integer id){
        return validationService.DeleteRoom(id);
    }

}
