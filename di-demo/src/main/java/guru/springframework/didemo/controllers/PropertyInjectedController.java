package guru.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.didemo.services.GreetingService;

//using autowired = using DI with Spring framework
@Controller
public class PropertyInjectedController {

   /*
    * Dependency injection - By class properties - least preferred => using private
    * properties is EVIL.
    */
   @Autowired
   @Qualifier("greetingServiceImpl")
   public GreetingService greetingService;

   public String sayHello() {
      System.out.print("==> GreetingService - ");
      return greetingService.sayGreeting();
   }

}
