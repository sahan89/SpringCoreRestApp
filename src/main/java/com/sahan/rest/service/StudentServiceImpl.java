package com.sahan.rest.service;

import com.sahan.rest.model.Student;
import com.sahan.rest.repository.StudentRepository;
import com.sahan.rest.utility.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public ResponseEntity<ResponseObject> saveStudentDetails(Student student) {
        ResponseObject responseObject;
        student.setCreatedDate(new Date());
        Student savedStudentObject = this.studentRepository.save(student);
        if (savedStudentObject != null) {
            responseObject = new ResponseObject("Saved Successfully.!", true, savedStudentObject);
            return new ResponseEntity(responseObject, HttpStatus.OK);
        } else {
            responseObject = new ResponseObject("Saving Error.!", false, null);
            return new ResponseEntity(responseObject, HttpStatus.NOT_ACCEPTABLE);
        }
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
