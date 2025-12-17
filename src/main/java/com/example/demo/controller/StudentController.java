package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController{
    @PostMapping("/postdata")
    public Stuentity postdata(@RequestBody Stuentity student){
        return studentService.saveStudent(student);
    }
}