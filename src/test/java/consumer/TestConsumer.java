package consumer;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.provide.service.HelloProviderService;
import com.provide.service.PersonProviderService;




public class TestConsumer {
	
	
	public static void main(String[] args) {

	
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        context.start();
        
        HelloProviderService helloService = (HelloProviderService) context.getBean("helloService");
        PersonProviderService personService =(PersonProviderService) context.getBean("personService");
        System.out.println(helloService.getHello());
        System.out.println(personService.getPersonInfo().toString());
        try {
            System.in.read();
        } catch (IOException e) {       
            e.printStackTrace();
        }  
 
    }
}
