package org.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConstructorXml {
    public static void main(String[] args) {

        // what is ApplicationContext ?
        // It is an IOC container which is used to create, manage, and inject beans inside spring container.
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("constructor-arg.xml");
        Writer writer = (Writer)applicationContext.getBean("writter");
        writer.write();
        System.out.println("================================");

        // to print all the beans
        // getBeanDefinitionNames() method is used
        String []beans = applicationContext.getBeanDefinitionNames();

        for(String bean : beans) System.out.println(bean);
    }
}
