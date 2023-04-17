package com.ingenio.studentapp.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDAO {
    private final List<Student> STUDENTS = new ArrayList<>();

    public List<Student> findAllStudent() {
        return STUDENTS;
    }

    public Student save(Student s) {
        if (s != null) {
            STUDENTS.add(s);
            return s;
        }

        return null;
    }

    public Student findByEmail(String email) {
        return STUDENTS.stream()
                .filter(student -> email.equals(student.getEmail()))
                .findFirst()
                .orElse(null);
    }

    public Student update(Student s) {
        var index = IntStream.range(0, STUDENTS.size())
                .filter(indx -> STUDENTS.get(indx).getEmail().equals(s.getEmail()))
                .findFirst()
                .orElse(-1);
        if (index > -1) {
            STUDENTS.set(index, s);
            return s;
        }
        return null;
    }

    public void delete(String email) {
        var student = findByEmail(email);
        if (student != null) {
            STUDENTS.remove(student);
        }
    }
}
