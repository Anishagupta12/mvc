package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.ContactUsEntity;
import in.ashokit.repo.ContactUsRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ContactUsRepo bean = context.getBean(ContactUsRepo.class);
		
		ContactUsEntity  entity = new 	ContactUsEntity();
		//entity.setCid(2);
		entity.setCname("genny");
		entity.setCemail("genny@gmail.com");
		entity.setPhno("877654892");
		
		bean.save(entity);		
		
	}

}
