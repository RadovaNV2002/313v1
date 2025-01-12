package ru.alexeykedr.springbootbootstrap.controller;

import org.springframework.web.bind.annotation.PathVariable;
import ru.alexeykedr.springbootbootstrap.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @GetMapping("/user")
    public String showUserInfo(@Valid User user, @PathVariable("id") Long id, Model model) {
        model.addAttribute("user", user);
        return "users/userPage";
    }
}