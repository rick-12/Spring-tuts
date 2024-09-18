package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("ritwik.xml");
//        Laptop laptop = (Laptop) applicationContext1.getBean("laptop");
//        laptop.getLaptop();
        Dev dev = (Dev) applicationContext.getBean("dev");
        dev.build();
    }
}
