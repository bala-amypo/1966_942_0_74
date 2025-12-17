package com.example.demo.Serviceimpl;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Stuentity;
import com.example.demo.repository.StudentRepository;

import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
    // private final StudentRepository studentRepository;
    // public StudentServiceImpl(StudentRepository studentRepository){
    //     this.studentRepository=studentRepository;
    // }

    @Autowired
    StudentRepository studentRepository;
public Student saveStudent(Stuentity student){
    return studentRepository.save(student);
}
}