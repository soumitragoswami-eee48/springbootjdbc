/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Broadsoft.repository;

import com.Broadsoft.model.StudentModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

/**
 *
 * @author sgoswami
 */

@Repository
public class StudentRepository {
        
     
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentRepository.class);
    
    @Autowired
    protected JdbcTemplate jdbc;

    public List<StudentModel> getUser() {
          LOGGER.info("Query is :---> SELECT * FROM student"); 
        return jdbc.query("SELECT * FROM student",new StudentRowMapper());
       
    }

    /**
     *
     * @param ids
     * @return
     */
    public List<StudentModel> getUsers(String ids) {
       // System.out.println(ids);
       LOGGER.info("Query is :---> SELECT * FROM student WHERE id in (?) "); 
        return jdbc.query("SELECT * FROM student WHERE id in (?)",new String []{ids}, new BeanPropertyRowMapper(StudentModel.class));
    }   
    
}

class StudentRowMapper implements RowMapper<StudentModel> {
        @Override
        public StudentModel mapRow(ResultSet rs, int rowNum) throws SQLException {
            System.out.println((rowNum+1)+" "+rs.getString("name"));
            StudentModel student = new StudentModel();
            student.setName(rs.getString("name"));
            student.setRoll(Integer.parseInt(rs.getString("roll")));
            student.setId(Integer.parseInt(rs.getString("id")));
            return student;
        }
    }