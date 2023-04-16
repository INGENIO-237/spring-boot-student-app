package com.ingenio.studentapp.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class DBStudentService implements StudentService {
    private StudentRepository _studentRepository;

    @Autowired
    public DBStudentService(StudentRepository studentRepository){
        this._studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAllStudent() {
        return _studentRepository.findAll();
    }

    @Override
    public Student save(Student s) {
        return _studentRepository.save(s);
    }

    @Override
    public Student findByEmail(String email) {
        return _studentRepository.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return _studentRepository.save(s);
    }

    @Override
    public void delete(String email) {
        _studentRepository.deleteByEmail(email);
    }
}
