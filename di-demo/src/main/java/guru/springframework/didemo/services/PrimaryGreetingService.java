package guru.springframework.didemo.services;

//@Service
//@Primary
//@Profile({"en", "default"}) //default profile active when there are no profile active
public class PrimaryGreetingService implements GreetingService {

   private GreetingRepository greetingRepository;

   public PrimaryGreetingService(GreetingRepository greetingRepository) {
      this.greetingRepository = greetingRepository;
   }

   @Override
   public String sayGreeting() {
      return greetingRepository.getEnglishGreeting();
   }

}
