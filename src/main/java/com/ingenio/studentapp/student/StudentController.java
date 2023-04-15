package com.ingenio.studentapp.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> findAllStudents(){
        return List.of(
                new Student("ABDEL", "BEN", LocalDate.now(), "abdel@ingenio.om", 34),
                new Student("KALIF", "HAMADOU", LocalDate.now(), "kalif@ingenio.om", 34)
        );
    }
}
