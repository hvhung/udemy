package guru.springframework.jokeapp.services;

import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{

   @Override
   public String getJoke() {
      return "Message from JokeServiceImpl";
   }

   public JokeServiceImpl() {
      
   }
}
