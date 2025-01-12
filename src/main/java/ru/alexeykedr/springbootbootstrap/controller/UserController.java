package ru.alexeykedr.springbootbootstrap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import ru.alexeykedr.springbootbootstrap.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.alexeykedr.springbootbootstrap.service.UserService;

import javax.validation.Valid;
import java.security.Principal;

@Controller
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String showUserInfo(Principal principal,  Model model) {
        model.addAttribute("user", userService.findByUsername(principal.getName()));
        return "users/userPage";
    }
}