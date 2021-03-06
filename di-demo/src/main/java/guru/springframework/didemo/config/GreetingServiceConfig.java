package guru.springframework.didemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import guru.springframework.didemo.services.GreetingRepository;
import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig {

   @Bean
   GreetingServiceFactory getFactory(GreetingRepository repository) {
      return new GreetingServiceFactory(repository);
   }
   
   @Bean
   @Primary
   @Profile({"default", "en"})
   GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
       return greetingServiceFactory.createGreetingService("en");
   }

   @Bean
   @Primary
   @Profile("es")
   GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
       return greetingServiceFactory.createGreetingService("es");
   }

   @Bean
   @Primary
   @Profile("de")
   GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
       return greetingServiceFactory.createGreetingService("de");
}
}
