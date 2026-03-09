package com.klu.springcorestudent;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = context.getBean("student", Student.class);
        student.display();

        context.close();   // 🔥 Close the context
    }
}