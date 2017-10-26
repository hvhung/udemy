package guru.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.didemo.controllers.ConstructorInjectedController;
import guru.springframework.didemo.controllers.GetterInjectedController;
import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.controllers.PropertyInjectedController;
import guru.springframework.didemo.examplebeans.FakeDataSource;
import guru.springframework.didemo.examplebeans.FakeJmsBroker;

@SpringBootApplication
//@ComponentScan(basePackages= {"guru.springframework.didemo.controllers", "guru.springframework.didemo.services" })
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		
      MyController controller = (MyController) ctx.getBean("myController");
		
      //exampleBean(ctx, controller);
      addMultiplePropertyFiles(ctx, controller);
	}
	
	static void addMultiplePropertyFiles(ApplicationContext ctx, MyController controller) {
	   FakeDataSource dataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
	   System.out.println(dataSource.getUser());
	   
	   FakeJmsBroker jms = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
	   System.out.println(jms.getUsername());
	}
	
	static void exampleBean(ApplicationContext ctx, MyController controller) {
      System.out.println("----- " + controller.hello());
	   System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
      System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
      System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
