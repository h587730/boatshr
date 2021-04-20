package com.example.demo.controller;


import com.example.demo.model.DiceResults;
import com.example.demo.model.User;
import com.example.demo.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {
	
	@Autowired
    UserRepository userRepo;
	
	
    @GetMapping("/")
    public String viewHomePage() {

        return "index";
    }
    
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {

        model.addAttribute("user", new User());
         
        return "signup_form";
    }

    
    @PostMapping("/process_register")
    public String processRegister(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
         
        userRepo.save(user);
         
        return "register_success";

   
}



    @GetMapping("/play_game")
    public ModelAndView showGameplay(ModelAndView mv){

        mv.addObject("dice", new DiceResults());
        mv.setView(gameplay);

        return mv;
    }
    
}