/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Broadsoft.controller;

import com.Broadsoft.model.StudentModel;
import com.Broadsoft.repository.StudentRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sgoswami
 */
    @RestController

public class Controller {
        
       @Autowired
       StudentRepository su;
       private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);
        
    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public List<StudentModel> getById(@PathVariable("id") String id) {
        LOGGER.info("getById() called"); 
       return su.getUsers(id);
    }

     @RequestMapping(value = "/sayhello", method = RequestMethod.GET)
    public String sayhello() {
        LOGGER.info("sayhello() called"); 
       return "Hello From springbootJDBC";
    }
    
    @RequestMapping("/")
    public List<StudentModel> getAllStudents() {
       LOGGER.info("getAllStudents() called"); 
         return  su.getUser();
    }
}

