package org.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        context.registerShutdownHook();

        //XML LFC
        LifeCycle lifeCycle = (LifeCycle) context.getBean("lifeCycle");
        System.out.println(lifeCycle.getPrice());

        //Interface LFC
        InterfaceLFC interfaceLFC = (InterfaceLFC) context.getBean("interfaceLFC");
        System.out.println(interfaceLFC.getPrice());

        //Annotation LFC
        AnnotationLFC annotationLFC = (AnnotationLFC) context.getBean("annotationLFC");
        System.out.println(annotationLFC.getPrice());
    }
}
