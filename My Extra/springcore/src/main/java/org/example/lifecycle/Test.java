package org.example.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
         AbstractApplicationContext context = new ClassPathXmlApplicationContext("file:D:\\Wiley Edge Training\\Java Practice\\My Extra\\springcore\\src\\main\\java\\org\\example\\lifecycle\\config.xml");
//        Samosa s = (Samosa) context.getBean("s1");
//        System.out.println(s);

//        Registering shutdown hook -> to call destroy
        context.registerShutdownHook();

//        Pepsi p = (Pepsi) context.getBean("p1");
//        System.out.println(p);

        Example e = (Example) context.getBean("example");
        System.out.println(e);
    }
}
