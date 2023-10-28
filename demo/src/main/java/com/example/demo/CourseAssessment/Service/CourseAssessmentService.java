package com.example.demo.CourseAssessment.Service;

import com.example.demo.CourseAssessment.Domain.CourseAssessment;
import com.example.demo.CourseAssessment.Domain.CourseAssessmentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseAssessmentService {
    @Autowired
    private CourseAssessmentRepository courseAssessmentRepository;

    public CourseAssessment saveCourseAssessment(CourseAssessment courseAssessment) {
        return courseAssessmentRepository.save(courseAssessment);
    }

    public CourseAssessment saveCourseAssessmentWithId(CourseAssessment courseAssessment, Long id) {
        Optional<CourseAssessment> existingAssessment = courseAssessmentRepository.findById(id);
        if (existingAssessment.isPresent()) {
            throw new RuntimeException("Ya existe un CourseAssessment con este ID");
        } else {
            courseAssessment.setId(id);
            return courseAssessmentRepository.save(courseAssessment);
        }
    }

    public void deleteCourseAssessmentById(Long id) {
        courseAssessmentRepository.deleteById(id);
    }

    public CourseAssessment partialUpdateCourseAssessment(Long id, CourseAssessment courseAssessment) {
        Optional<CourseAssessment> existingAssessment = courseAssessmentRepository.findById(id);
        if (existingAssessment.isPresent()) {
            BeanUtils.copyProperties(courseAssessment, existingAssessment.get(), "id");
            return courseAssessmentRepository.save(existingAssessment.get());
        }
        return null;
    }
}

