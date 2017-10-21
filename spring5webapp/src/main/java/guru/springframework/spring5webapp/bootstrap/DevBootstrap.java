package guru.springframework.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

   private AuthorRepository authorRepository;
   private BookRepository bookRepository;
   private PublisherRepository publisherRepository;
   
   public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository,
         PublisherRepository publisherRepository) {
      this.authorRepository = authorRepository;
      this.bookRepository = bookRepository;
      this.publisherRepository = publisherRepository;
   }

   @Override
   public void onApplicationEvent(ContextRefreshedEvent event) {
      initData();
   }

   private void initData() {
      Publisher publisher = new Publisher();
      publisher.setName("foo");
      publisherRepository.save(publisher);
      
      Author xiong = new Author("Xiong","Huang");
      Book book1 = new Book("Book 1", "1234", publisher);
      xiong.getBooks().add(book1);
      book1.getAuthors().add(xiong);
      authorRepository.save(xiong);
      bookRepository.save(book1);
      
      Author hung = new Author("Hung","Huynh");
      Book book2 = new Book("Book 2", "64443", publisher);
      hung.getBooks().add(book2);
      book2.getAuthors().add(hung);
      authorRepository.save(hung);
      bookRepository.save(book2);
      
   }
}
