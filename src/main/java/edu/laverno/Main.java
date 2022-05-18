package edu.laverno;

import edu.laverno.domain.Person;
import edu.laverno.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Main {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class)) {
            PersonService service = context.getBean(PersonService.class);

            Person ivan = service.getByName("Ivan");
            System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
