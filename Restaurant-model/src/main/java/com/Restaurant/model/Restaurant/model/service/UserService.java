package com.Restaurant.model.Restaurant.model.service;

import com.Restaurant.model.Restaurant.model.entity.User;
import com.Restaurant.model.Restaurant.model.repo.UserFactry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserFactry userFactry;


    public List<User> getAllUser() {
        return userFactry.getUserList();
    }

    public String addUsers(List<User> myUsers) {
        getAllUser().addAll(myUsers);

        return myUsers.size() + " users were added!";
    }

    public String getUserId(Integer userId) {
//        User user=new User();
//        user.setUserId(userId);
//        return user;
        for (User user1 : getAllUser()) {
            if (user1.getUserId().equals(userId)) {
                return "existing UserId" + user1;
            }
        }

        return "Invalided UserId";
    }


    public String changeFood(Integer Id, String speciality) {
            for(User  M: getAllUser()){
                if(M.getUserId().equals(Id)){
                    M.setUseSpecialty(speciality);
                    return "change  food Speciality";
                }
            }
            return "Id not match";

    }

    public String deleteValue(Integer id) {
        for(User m : getAllUser() ){
            if(m.getUserId().equals(id)){
                getAllUser().remove(m);
                return "Delete value";
            }

        }
        return "id nt match";
    }
}
