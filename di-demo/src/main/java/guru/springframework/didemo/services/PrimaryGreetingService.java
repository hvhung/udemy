package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"}) //default profile active when there are no profile active
public class PrimaryGreetingService implements GreetingService {

   @Override
   public String sayGreeting() {
      return "Greeting from Primary Greeting Service EN profile";
   }

}
