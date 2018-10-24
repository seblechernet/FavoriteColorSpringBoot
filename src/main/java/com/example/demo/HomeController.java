package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    User user;
    @RequestMapping("/")
    public String index(Model model){
      model.addAttribute("userobject",new User());
      model.addAttribute("question1","What is your name?");
      model.addAttribute("question2","What is your quest?");
      model.addAttribute("question3",user.randomGenerator());


          return "index";
    }

    @RequestMapping("/display")
    public String display(@ModelAttribute ("userobject") User tosave, Model model){
    model.addAttribute("userobject", tosave);
     return "display";
    }


}
