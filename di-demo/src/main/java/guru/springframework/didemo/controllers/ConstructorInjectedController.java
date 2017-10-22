package guru.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.didemo.services.GreetingService;

//using autowired = using DI with Spring framework
@Controller
public class ConstructorInjectedController {

   /*
    * Dependency injection - By Constructor - Most Preferred
    */
   
   private GreetingService greetingService;
   
   @Autowired
   public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
      this.greetingService = greetingService;
   }

   public String sayHello() {
      return greetingService.sayGreeting();
   }
   
}
