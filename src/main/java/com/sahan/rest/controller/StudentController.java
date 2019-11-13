package com.sahan.rest.controller;

import com.sahan.rest.model.Student;
import com.sahan.rest.service.StudentService;
import com.sahan.rest.utility.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/studentController")
public class StudentController {
    private final String APPLICATION_JSON = "application/json";

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/saveStudent", method = RequestMethod.POST, produces = {APPLICATION_JSON})
    public ResponseEntity<ResponseObject> saveStudentDetails(@RequestBody Student student) {
        return this.studentService.saveStudentDetails(student);
    }

    @RequestMapping(value = "/getAllStudents", method = RequestMethod.GET, produces = {APPLICATION_JSON})
    public List<Student> getAllStudents() {
        return this.studentService.getAllStudents();
    }
}
