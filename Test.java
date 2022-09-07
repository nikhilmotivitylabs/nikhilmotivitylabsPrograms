package com.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(SpringJDBCConfiguration.class);

        EmployeeDao dao=(EmployeeDao)factory.getBean(EmployeeDao.class);

       dao.selectEx();

    }



}
