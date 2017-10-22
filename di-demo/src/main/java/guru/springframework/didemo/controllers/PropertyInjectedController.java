package guru.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.didemo.services.GreetingServiceImpl;

//using autowired = using DI with Spring framework
@Controller
public class PropertyInjectedController {

   /*
    * Dependency injection - By class properties - least preferred => using private
    * properties is EVIL.
    */
   @Autowired
   public GreetingServiceImpl greetingServiceImpl;

   public String sayHello() {
      return greetingServiceImpl.sayGreeting();
   }

}
