package com.sahan.rest.service;

import com.sahan.rest.model.Student;
import com.sahan.rest.utility.ResponseObject;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {
    ResponseEntity<ResponseObject> saveStudentDetails(Student student);

    List<Student> getAllStudents();
}
