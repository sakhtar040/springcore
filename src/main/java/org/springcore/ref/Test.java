package org.springcore.ref;

import org.springcore.collections.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("ref.xml");
        A a = (A) context.getBean("aRef");

        System.out.println(a.getX());
        System.out.println(a.getOb());
    }
}
