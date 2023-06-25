package com.osiki.springmvcthmeleaftutorial.repository;

import com.osiki.springmvcthmeleaftutorial.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
