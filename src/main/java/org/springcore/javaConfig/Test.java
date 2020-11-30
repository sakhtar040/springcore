package org.springcore.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Sample sample = context.getBean("getSample", Sample.class);
        System.out.println(sample);
        sample.newSample();
    }
}
