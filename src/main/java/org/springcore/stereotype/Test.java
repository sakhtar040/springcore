package org.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotype.xml");
        Employee employee = context.getBean("employee", Employee.class);
        Employee employee1 = context.getBean("employee", Employee.class);

        System.out.println(employee);
        System.out.println(employee.hashCode());
        System.out.println(employee1.hashCode());
    }
}
