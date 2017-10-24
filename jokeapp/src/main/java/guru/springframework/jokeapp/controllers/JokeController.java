package guru.springframework.jokeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.jokeapp.services.JokeService;

@Controller
public class JokeController {

   private JokeService service;

   @Autowired
   public JokeController(JokeService service) {
      this.service = service;
   }
   
   @RequestMapping({"","/"})
   public String showJoke(Model model) {
      model.addAttribute("joke",service.getJoke());
      return "mjoke";
   }
}
