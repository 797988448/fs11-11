package com.usermanegement.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class AppController {

    @Autowired
    private List<User> applist;

    // Add user
    @PostMapping("post")
    public String addUserId(@RequestBody User Myuser) {
        applist.add(Myuser);
        return "User added successfully";
    }

    // Get a user by ID
    @GetMapping("getUser/{userId}")
    public String  getUserId(@PathVariable Integer userId) {
       for(User user1:applist){
           if(user1.getUserId().equals(userId)){
               return "existing UserId"+user1;
           }
       }
       return "Invalided UserId";
    }

    // Get all users
    @GetMapping("post1")
    public List<User> getAllUsers() {
        return applist;
    }

    // Update user info
    @PutMapping("updateUserInfo/{userId}")
    public String updateUserInfo(@PathVariable Integer userId, @RequestBody Integer updatedUser) {
        for(User user3 : applist)
        {
            if(user3.getUserId().equals(userId))
            {
                user3.setUserId(updatedUser);
                return "User: "   + userId  + "updated to " +  updatedUser;
            }
        }

        return "Invalid id";
    }

    // Delete a user
    @DeleteMapping("deleteUser/{userId}")
    public String deleteUser(@PathVariable Integer userId) {
        for(User user2 : applist)
        {
            if(user2.getUserId().equals(userId))
            {
                applist.remove( userId);
                return "todo: "   +  userId  + " removed";
            }
        }

        return "Invalid id";
    }
}



