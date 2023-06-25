package com.osiki.springmvcthmeleaftutorial.service;

import com.osiki.springmvcthmeleaftutorial.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);
}
