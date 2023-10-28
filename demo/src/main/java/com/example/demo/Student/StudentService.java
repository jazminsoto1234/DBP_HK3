package com.example.demo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import org.springframework.stereotype.Service;


@Service
public class StudentService{
    @Autowired
    private StudentRepository studentRepository;

    public void saveStudent(Student student_){
        studentRepository.save(student_);
    }

    public Optional<Student> findStudentById(Long id){
        return studentRepository.findById(id);
    }

    public void deleteStudentById(Long id){
        studentRepository.deleteById(id);
    }

}