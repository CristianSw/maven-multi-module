package controllers;


import domain.UserCommand;
import entities.User;

public class UserController {
    User saveUser(UserCommand command){
        return new User();
    }
}
