package com.example.demo.CourseAssessmentDetails.Service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.CourseAssessment.Domain.CourseAssessment;
import com.example.demo.CourseAssessmentDetails.Domain.CourseAssessmentDetails;
import com.example.demo.CourseAssessmentDetails.Domain.CourseAssessmentDetailsRepository;

@Service
public class CourseAssessmentDetailsService {
    //Añadir
    @Autowired
    private CourseAssessmentDetailsRepository courseAssessmentDetailsRepository;
    
    public CourseAssessmentDetails saveCourseAssessmentDetails(CourseAssessmentDetails courseAssessmentDetails){
        return courseAssessmentDetailsRepository.save(courseAssessmentDetails);
    }


    public CourseAssessmentDetails saveCourseAssessmentWithId(CourseAssessmentDetails courseAssessmentDetails, Long id) {
        Optional<CourseAssessmentDetails> existingAssessmentDetails = courseAssessmentDetailsRepository.findById(id);
        if (existingAssessmentDetails.isPresent()) {
            throw new RuntimeException("Ya existe un CourseAssessmentDetail con este ID");
        } else {
            courseAssessmentDetails.setId(id);
            return courseAssessmentDetailsRepository.save(courseAssessmentDetails);
        }
    }

    public void deleteCourseAssessmentDetailsById(Long id) {
        courseAssessmentDetailsRepository.deleteById(id);
    }

    public CourseAssessmentDetails partialUpdateCourseAssessmentDetails(Long id, CourseAssessmentDetails courseAssessmentDetails) {
        Optional<CourseAssessmentDetails> existingAssessmentDetails = courseAssessmentDetailsRepository.findById(id);
        if (existingAssessmentDetails.isPresent()) {
            BeanUtils.copyProperties(courseAssessmentDetails, existingAssessmentDetails.get(), "id");
            return courseAssessmentDetailsRepository.save(existingAssessmentDetails.get());
        }
        return null;
    }

    public CourseAssessmentDetails getDetailsById(Long id){
        return courseAssessmentDetailsRepository.findById(id).get();
    }
}
