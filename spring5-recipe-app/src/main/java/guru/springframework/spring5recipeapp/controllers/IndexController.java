package guru.springframework.spring5recipeapp.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5recipeapp.model.Category;
import guru.springframework.spring5recipeapp.model.UnitOfMeasure;
import guru.springframework.spring5recipeapp.repositories.CategoryRepository;
import guru.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;

@Controller
public class IndexController {

   private CategoryRepository categoryRepository;
   private UnitOfMeasureRepository unitOfMeasureRepository;
   
   public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
      this.categoryRepository = categoryRepository;
      this.unitOfMeasureRepository = unitOfMeasureRepository;
   }

   @RequestMapping({"","/","/index"})
   public String getIndexPage() {
      Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
      Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
      
      System.out.println("Cat Id is: " + categoryOptional.get().getId());
      System.out.println("UOM ID is: " + unitOfMeasureOptional.get().getId());
      
      return "index";
   }
   
}
