package com.employee;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.util.ClassUtils;

@Configuration
public class SpringJDBCConfiguration {
    @Bean
    public DataSource dataSource() {
        Object DriverManagerDataSource;
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        //MySQL database we are using
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/maxhospital");//change url
        dataSource.setUsername("root");//change userid
        dataSource.setPassword("root");//change pwd



        //H2 database
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public EmployeeDao employeeDao(){
        EmployeeDao empDao = new EmployeeDao();
        return empDao;
    }

}

