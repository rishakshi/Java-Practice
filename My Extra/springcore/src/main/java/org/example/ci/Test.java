package org.example.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:D:\\Wiley Edge Training\\Java Practice\\My Extra\\springcore\\src\\main\\java\\org\\example\\ci\\ciconfig.xml");
//        Person p = (Person) context.getBean("person");
//        System.out.println(p);

        Addition a = (Addition) context.getBean("add");
        a.doSum();
//        System.out.println(a);

    }
}
