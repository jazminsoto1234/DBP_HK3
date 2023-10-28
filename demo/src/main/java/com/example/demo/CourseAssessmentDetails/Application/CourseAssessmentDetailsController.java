package com.example.demo.CourseAssessmentDetails.Application;
import com.example.demo.Course.Service.CourseService;
import com.example.demo.CourseAssessment.Service.CourseAssessmentService;
import com.example.demo.CourseAssessmentDetails.Domain.CourseAssessmentDetails;
import com.example.demo.CourseAssessmentDetails.Service.CourseAssessmentDetailsService;
import com.example.demo.CourseType.Service.CourseTypeService;
import com.example.demo.Periodo.Service.PeriodoService;
import com.example.demo.Professor.ProfessorService;
import com.example.demo.Student.Student;
import com.example.demo.Student.StudentService;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseAssessmentDetailsController {
    @Autowired
    private CourseTypeService courseTypeService;
    @Autowired
    private PeriodoService periodoService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private ProfessorService professorService;
    @Autowired
    private CourseAssessmentService courseAssessmentService;

    @Autowired
    private CourseAssessmentDetailsService courseAssessmentDetailsService;

    //@GetMapping
    /*public ResponseEntity<List<CourseAssessmentDetails>> getAllCourseDetails() {
        List<CourseAssessmentDetails> courseDetailsList = courseAssessmentDetailsService();
        return ResponseEntity.ok(courseDetailsList);
    }*/

    //FALTA :  AÑADIR FIND ALL A TODOS LAS ENTIDADES EN SERVICE Y GET ID EN TODA ENTIDAD Y UNA ACTUALIZACION EN PROFESOR Y ESTUDIANTE
}
