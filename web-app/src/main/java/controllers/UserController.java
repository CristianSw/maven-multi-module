package controllers;


import converter.UserConverter;
import domain.UserCommand;
import entities.User;

public class UserController {
    User saveUser(UserCommand command){
        return UserConverter.INSTANCE.UserCommandToUser(command);
    }
}
