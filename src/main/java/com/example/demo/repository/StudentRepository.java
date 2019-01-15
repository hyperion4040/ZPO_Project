package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student,Long> {

    List<Student> findStudentByLastName(String lastName);
    Optional<Student> findById(Long id);
    List<Student> findAll(Pageable p);
}
