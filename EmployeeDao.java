package com.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class EmployeeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    public void selectEx(){
        List<Map<String,Object>> li =jdbcTemplate.queryForList("select * from  employee12");
        Iterator<Map<String,Object>> it = li.iterator();
        while(it.hasNext()){
            Object o=it.next();
            System.out.println(o.toString());
        }
    }
}
