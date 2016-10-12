/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skywalkers.Service;

import com.skywalkers.DAO.StudentDao;
import com.skywalkers.Entity.Student;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aleksandar
 */
@Service
public class StudentService {
    
    @Autowired
    private StudentDao studentDao;
    
    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }
    
}
