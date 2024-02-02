package com.antoniiviazovskyi.spring.preregistration.controllers;

import com.antoniiviazovskyi.spring.preregistration.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class UserController {
    @RequestMapping("/")
    public String start(){
        return "start-view";
    }

    @RequestMapping("/askUserDetails")
    public String askUserDetails(Model model) {
        model.addAttribute("userdata",new UserData());
        return "registration-view";
    }

    @RequestMapping("/registrationComplete")
    public String completeRegistration(@Valid @ModelAttribute("userdata") UserData data, BindingResult result) {
        if(result.hasErrors()) return "registration-view";
        else return "registration-complete-view";
    }
}
