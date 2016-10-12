/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skywalkers.Controller;

import com.skywalkers.Entity.Student;
import com.skywalkers.Service.StudentService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author aleksandar
 */
@RestController
@RequestMapping(value = "/students")
public class StudentController {
    
    @Autowired
    private StudentService studentService;
    
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    
}
