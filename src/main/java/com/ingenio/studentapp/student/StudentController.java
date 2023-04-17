package com.ingenio.studentapp.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private StudentService _studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this._studentService = studentService;
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return _studentService.findAllStudent();
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student s) {
        return _studentService.save(s);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email) {
        return _studentService.findByEmail(email);
    }

    @DeleteMapping("/{email}")
    public void deleteStudent(@PathVariable String email) {
        _studentService.delete(email);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student s) {
        return _studentService.update(s);
    }


}
