package com.Restaurant.model.Restaurant.model.contoller;

import com.Restaurant.model.Restaurant.model.entity.User;
import com.Restaurant.model.Restaurant.model.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class Usercontroller {
    @Autowired
       UserService userService;
@GetMapping("getUser/{userId}")
    public String  getUser(@PathVariable Integer userId){
        return "return "+userService.getUserId(userId);
    }
    @GetMapping("user")
    public List<User> getAllUser()
    {
        return  userService.getAllUser();
    }

    @PostMapping("users/post")
    public String addUsers(@RequestBody @Valid List<User> myUsers)
    {
        return  userService.addUsers(myUsers);
    }
    @PutMapping("speciality/food/Id/{Id}")
    public String changeFood(@PathVariable Integer Id, @RequestParam String speciality) {
        return userService.changeFood(Id, speciality);
    }
    @DeleteMapping("remove/value/{id}")
    public String deleteValue(@PathVariable Integer id){
        return userService.deleteValue(id);
    }
}
