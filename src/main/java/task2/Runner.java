package task2;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import task2.classes.Employee;
import task2.classes.Position;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanTask2.xml");

        Position worker = (Position) context.getBean("worker");
        Position director = (Position) context.getBean("director");
        Position secretary = (Position) context.getBean("secretary");

        Employee vadim = (Employee) context.getBean("vadim");
        Employee ivan = (Employee) context.getBean("ivan");
        Employee marina = (Employee) context.getBean("marina");
        Employee dasha = (Employee) context.getBean("dasha");
        Employee anna = (Employee) context.getBean("anna");
        Employee alex = (Employee) context.getBean("alex");


        System.out.println(worker.toString());
        System.out.println(director.toString());
        System.out.println(secretary.toString());
        System.out.println("********************");
        System.out.println(vadim.toString());
        System.out.println(ivan.toString());
        System.out.println(marina.toString());
        System.out.println(dasha.toString());
        System.out.println(anna.toString());
        System.out.println(alex.toString());
        ((AbstractApplicationContext) context).close();
    }

}
