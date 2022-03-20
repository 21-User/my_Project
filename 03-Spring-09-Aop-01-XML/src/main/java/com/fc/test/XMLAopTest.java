package com.fc.test;

import com.fc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLAopTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = applicationContext.getBean(UserService.class);

        userService.add();

        System.out.println("-----------------");

        userService.update();
    }
}
