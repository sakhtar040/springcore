package org.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalone_collections.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        System.out.println(student.getSubjects().getClass().getName());
        System.out.println(student.getCourses().getClass().getName());
        System.out.println(student.getProperties().getClass().getName());
    }
}
