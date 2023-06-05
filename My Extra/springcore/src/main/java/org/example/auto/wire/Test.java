package org.example.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:D:\\Wiley Edge Training\\Java Practice\\My Extra\\springcore\\src\\main\\java\\org\\example\\auto\\wire\\autoconfig.xml");
        Emp e = context.getBean("emp1", Emp.class);
        System.out.println(e);
    }
}
