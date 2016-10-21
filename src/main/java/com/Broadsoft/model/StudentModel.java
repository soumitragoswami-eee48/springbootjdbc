/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Broadsoft.model;

/**
 *
 * @author sgoswami
 */
public class StudentModel {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
   
    private int id;
    private String name;
    private int roll;

    public StudentModel() {
    }
    public StudentModel(int id,String name,int roll)
    {
        this.id=id;
        this.name=name;
        this.roll=roll;
    }
    
    public long getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }
      
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    


}
