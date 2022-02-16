package com.UserApi.demo.UserExceptions;

public class ClientNotFoundException extends RuntimeException{
    public ClientNotFoundException(Long pId){
        super ("This User does not exist!!!\nId: " + pId);
    }
}
