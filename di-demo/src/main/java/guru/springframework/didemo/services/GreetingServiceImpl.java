package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

   public static final String GREETING = "Greeting from GreetingServiceImpl";
   
   @Override
   public String sayGreeting() {
      return GREETING;
   }

}
