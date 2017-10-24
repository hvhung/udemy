package guru.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.didemo.services.GreetingService;

@Controller
public class MyController {

   //refactor to use primary bean - greetingservice
   
   private GreetingService greetingService;
   
   public MyController(GreetingService greetingService) {
      this.greetingService = greetingService;
   }

   public String hello() {
      System.out.print("==> GreetingService - ");
      return greetingService.sayGreeting();
   }
}
