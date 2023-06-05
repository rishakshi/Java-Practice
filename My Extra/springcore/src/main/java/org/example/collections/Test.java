package org.example.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:D:\\Wiley Edge Training\\Java Practice\\My Extra\\springcore\\src\\main\\java\\org\\example\\collections\\collectionconfig.xml");
        Emp e1 = (Emp)context.getBean("emp1");
        System.out.println(e1);
    }
}
