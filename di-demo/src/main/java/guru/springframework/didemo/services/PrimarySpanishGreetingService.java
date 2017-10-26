package guru.springframework.didemo.services;

//@Service
//@Primary
//@Profile("es")
public class PrimarySpanishGreetingService implements GreetingService {

   private GreetingRepository greetingRepository;

   public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
      this.greetingRepository = greetingRepository;
   }

   @Override
   public String sayGreeting() {
      return greetingRepository.getSpanishGreeting();
   }

}
