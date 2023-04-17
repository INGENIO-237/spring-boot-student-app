package com.ingenio.studentapp.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryStudentService implements StudentService {

    private InMemoryStudentDAO _inMemoryStudentDAO;

    @Autowired
    public InMemoryStudentService(InMemoryStudentDAO inMemoryStudentDAO) {
        this._inMemoryStudentDAO = inMemoryStudentDAO;
    }

    @Override
    public List<Student> findAllStudent() {

        return _inMemoryStudentDAO.findAllStudent();
    }

    @Override
    public Student save(Student s) {

        return _inMemoryStudentDAO.save(s);
    }

    @Override
    public Student findByEmail(String email) {

        return _inMemoryStudentDAO.findByEmail(email);
    }

    @Override
    public Student update(Student s) {

        return _inMemoryStudentDAO.update(s);
    }

    @Override
    public void delete(String email) {
        _inMemoryStudentDAO.delete(email);
    }
}
