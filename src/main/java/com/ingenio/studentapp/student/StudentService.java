package com.ingenio.studentapp.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> findAllStudent();

    Student save(Student s);

    Student findByEmail(String email);

    Student update(Student s);

    void delete(String email);
}
