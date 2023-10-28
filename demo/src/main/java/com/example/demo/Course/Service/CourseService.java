package com.example.demo.Course.Service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Course.Domain.Course;
import com.example.demo.Course.Domain.CourseRepository;



@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public Course saveCourse(Course course){
        return courseRepository.save(course);
    }

    public Course  saveCourse( Course course ,Long id){
        Optional<Course> existe= courseRepository.findById(id);
        if (existe.isPresent()){
            throw new RuntimeException("Ya existe un Course con este ID");   }
        else{
            course.setId(id);
            return  courseRepository.save(course);
        }
    }

    public Course getbyCourseId(Long id){
        return courseRepository.findById(id).get();
    }

    public void deleteCourseById(Long id) {
        courseRepository.deleteById(id);
    }

    public Course partialUpdatecCourse(Long id ,  Course course ){
        Optional<Course> existeCourse=  courseRepository.findById(id);
        if (existeCourse.isPresent()){
            BeanUtils.copyProperties( course, existeCourse.get(), "id");
            return courseRepository.save(existeCourse.get());
        }
        return null;
    }



}
