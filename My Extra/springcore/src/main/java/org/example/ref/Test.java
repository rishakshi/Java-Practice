package org.example.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:D:\\Wiley Edge Training\\Java Practice\\My Extra\\springcore\\src\\main\\java\\org\\example\\ref\\refconfig.xml");
        A a = (A) context.getBean("aref");
        System.out.println(a);
    }
}
