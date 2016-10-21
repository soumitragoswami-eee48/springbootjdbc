/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Broadsoft.controller;

import com.Broadsoft.model.StudentModel;
import com.Broadsoft.repository.StudentRepository;
import java.util.List;
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
        
    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public List<StudentModel> greeting(@PathVariable("id") String id) {
        
       return su.getUsers(id);
    }

    @RequestMapping("/")
    public List<StudentModel> WelcomeMessage() {
         return  su.getUser();
    }
}

