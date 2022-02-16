package com.UserApi.demo.Controllers;

import com.UserApi.demo.ModelMaker.UserModelMaker;
import com.UserApi.demo.Models.User;
import com.UserApi.demo.UserServices.UserServices;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping ("/user")
public class UserController {

    @Autowired UserServices userServices;

    private static UserModelMaker USER_MODEL_MAKER = new UserModelMaker();

    @GetMapping("/")
    @ApiOperation(value = "Get all registered users.", notes = "Returns a list with all registered users", response = Contact.class)
    @ApiResponses( value = {
            @ApiResponse(code = 200, message = "Desde aca podemos decir que salio todo joya"),
            @ApiResponse(code = 400, message = "Y documentar causas y soluciones para diferentes tipos de problemas.")
    })
    public List<EntityModel<User>> getAllUsers(){
        List<EntityModel<User>> userList = userServices.getAllUsers().stream()
                .map(USER_MODEL_MAKER::toModel)
                .collect(Collectors.toList());
        return userList;
    }

    @GetMapping("/{Id}")
    @ApiOperation(value = "Find User by ID.", notes = "Returns the user that matches the provided Id", response = Contact.class)
    @ApiResponses( value = {
            @ApiResponse(code = 200, message = "Desde aca podemos decir que salio todo joya"),
            @ApiResponse(code = 400, message = "Y documentar causas y soluciones para diferentes tipos de problemas.")
    })
    public EntityModel<User> findUserById(@RequestParam (value = "pId") Long pId){
        return USER_MODEL_MAKER.toModel(userServices.findUserById(pId));
    }
}
