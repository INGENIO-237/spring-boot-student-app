package com.ingenio.studentapp.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudent(){
        return List.of(
                new Student("ABDEL", "BEN", LocalDate.now(), "abdel@ingenio.om", 34),
                new Student("KALIF", "HAMADOU", LocalDate.now(), "kalif@ingenio.om", 34)
        );
    }
}
