package ua.com.poster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.com.poster.entity.User;
import ua.com.poster.service.UserService;

import java.security.Principal;

/**
 * Created by MackGeeker on 11.06.2017.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model)
    {
        model.addAttribute("user", new User());
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String signUp(@ModelAttribute User user){
        try {
            userService.save(user);
        }catch (Exception e){
            return "error";
        }
        return "redirect:/home";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginprocesing(){
        return "redirect:profile";
    }


    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String profile(Model model,
                          @PathVariable String username){

        /*User name in navBar*/
        model.addAttribute("usrname", userService.findUserByUsername(username));
        return "profile";
    }

}