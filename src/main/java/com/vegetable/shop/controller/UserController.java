package com.vegetable.shop.controller;

import com.vegetable.shop.Entities.User;
import com.vegetable.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.security.Principal;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String userPanel(Principal principal, Model model){
        User user = userService.findByUsername(principal.getName());

        if (user != null) {
            model.addAttribute("user", user);
        }else {
            return "error/404";
        }

        return "user";
    }


    @GetMapping("/list")
    public String listStudents(Model model) {
        model.addAttribute("userList", userService.fetchAll());
        return "registeruser";
    }

    @GetMapping("/list/{id}")
    public String deleteStudent(@PathVariable Long id) {
        userService.deleteById(id);
        return "redirect:/list";
    }

}
