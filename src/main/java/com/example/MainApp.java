package com.example;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
    public static void main(String[] args) {
        //BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld helloWorldBean = (HelloWorld) context.getBean("helloWorld");
        
        HelloWorld helloWorldBean2 = (HelloWorld) context.getBean("helloWorld");
     
        System.out.println(helloWorldBean);
        System.out.println(helloWorldBean2);
        helloWorldBean.printMessage();
        System.out.println(helloWorldBean.getEmail());
        System.out.println(helloWorldBean.getHelloCity().getName());
        
        System.out.println(helloWorldBean);
        System.out.println(helloWorldBean2);

        System.out.println(helloWorldBean.getHelloCity());  
        System.out.println(helloWorldBean2.getHelloCity());  
        System.out.println(helloWorldBean2.getHelloCity());
        
    }
}
