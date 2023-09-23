package com.validation.validation.validationservice;

import com.validation.validation.Repo.IValidationRepo;
import com.validation.validation.model.Validation;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
public class ValidationService {
    @Autowired
    IValidationRepo iValidationRepo;
    public String addStocks(List<Validation> newvalidation) {
        for(Validation vl:newvalidation){
            vl.setDate(LocalDate.now());
            vl.setTime(LocalTime.now());

        }
        iValidationRepo.saveAll(newvalidation);

        return "Added";

    }

    public Validation  getUserId(Integer id) {
       return iValidationRepo.findById(id).get();
       // return "existing UserId "+iValidationRepo;

    }

    public List<Validation> getAllUser() {
        return (List<Validation>) iValidationRepo.findAll();
    }

    public String updateStockByType(Integer id, String userName) {

        Validation presentId = iValidationRepo.findById(id).orElse(null);
        if(presentId != null)
        {
            presentId.setUserName(userName);
            iValidationRepo.save(presentId);
            return "UserName updated!!";
        }
        else {
            return "UserId not found!";
        }
    }
    public String DeleteRoom(Integer id) {
        Optional<Validation> rooms = iValidationRepo.findById(id);
        if (rooms.isPresent()) {
            iValidationRepo.deleteById(id);
            return "Room  id no " + id + " successfully Deleted";
        } else {
            return "Not  Match Id Number ";
        }

    }

}
