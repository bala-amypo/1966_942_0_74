package com.example.demo.Serviceimpl;
import com.example.demo.entity.Stuentity;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
public Student saveStudent(Stuentity student){
    return studentRepository.save()
}
}