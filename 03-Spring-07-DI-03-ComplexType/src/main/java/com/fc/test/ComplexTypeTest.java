package com.fc.test;

import com.fc.entity.Car;
import com.fc.entity.ComplexType;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComplexTypeTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        ComplexType complexType = applicationContext.getBean(ComplexType.class);

        System.out.println(complexType);
    }
}