package com.example.demo.CourseAssessmentDetails;

import java.util.List;

public interface CourseAssessmentDetailsService {
    CourseAssessmentDetails findById(Long id);
    CourseAssessmentDetails create(CourseAssessmentDetails details);
    CourseAssessmentDetails update(Long id, CourseAssessmentDetails updatedDetails);
    List<CourseAssessmentDetails> getAllCourseAssessmentDetails();
    void delete(Long id);
    
}

