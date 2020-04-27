package task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import task1.classes.*;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeansTask1.xml");

      F beanF= (F) context.getBean("BeanF");
      System.out.println(beanF.toString());
      ((AbstractApplicationContext) context).close();
    }
}
