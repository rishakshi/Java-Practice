package org.example.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:D:\\Wiley Edge Training\\Java Practice\\My Extra\\springcore\\src\\main\\java\\org\\example\\standalone\\collections\\aloneconfig.xml");
        Person p = context.getBean("person1", Person.class);
        System.out.println(p);
        System.out.println(p.getFriends().getClass().getName());
        System.out.println(p.getFeeStructure());
        System.out.println(p.getFeeStructure().getClass().getName());
    }
}
