/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skywalkers.DAO;

import com.skywalkers.Entity.Student;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aleksandar
 */
@Repository
public class StudentDao {
    
    private static final Map<Integer, Student> STUDENTS;
    
    static {
        STUDENTS = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Alex", "Programming"));
                put(2, new Student(1, "Dojce", "Computer Science"));
                put(3, new Student(1, "Rade", "JS Programming"));
            }
        };
    }
    
    public Collection<Student> getAllStudents() {
        return StudentDao.STUDENTS.values();
    }
    
}
