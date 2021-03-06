package com.UserApi.demo.UserServices;

import com.UserApi.demo.DataBases.UserDBA;
import com.UserApi.demo.Models.User;
import com.UserApi.demo.UserExceptions.ClientNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServices {

    @Autowired
    private UserDBA userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User findUserById(Long pId){
        return userRepository.findById(pId).orElseThrow(()-> new ClientNotFoundException(pId));
    }
}
