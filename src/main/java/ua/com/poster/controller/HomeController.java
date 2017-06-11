package ua.com.poster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.com.poster.service.UserService;

/**
 * Created by MackGeeker on 07.06.2017.
 */
@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/", "/home" }, method = RequestMethod.GET)
    public String home(Model model){

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username

        if (name.equals("anonymousUser") || name.equals("admin")){

        }else {
        model.addAttribute("usrname", userService.findOne(Integer.parseInt(name)));}

        model.addAttribute("allUsers", userService.findAll());



        return "home";
    }

    @RequestMapping(value =  "/login" , method = RequestMethod.GET)
    public String login(){
        return "login";
    }




}