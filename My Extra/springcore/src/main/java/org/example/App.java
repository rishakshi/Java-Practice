package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("file:D:\\Wiley Edge Training\\Java Practice\\My Extra\\springcore\\src\\main\\java\\org\\example\\config.xml");

        Student s1 = (Student) context.getBean("student1");
        System.out.println(s1);

        Student s2 = (Student) context.getBean("student2");
        System.out.println(s2);

        Student s3 = (Student) context.getBean("student3");
        System.out.println(s3);
    }
}
