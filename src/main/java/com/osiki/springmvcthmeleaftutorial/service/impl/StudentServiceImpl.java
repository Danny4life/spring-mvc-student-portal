package com.osiki.springmvcthmeleaftutorial.service.impl;

import com.osiki.springmvcthmeleaftutorial.entity.Student;
import com.osiki.springmvcthmeleaftutorial.repository.StudentRepository;
import com.osiki.springmvcthmeleaftutorial.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}