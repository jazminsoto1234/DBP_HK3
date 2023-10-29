package com.example.demo.CourseAssessmentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course_assessment_details")
public class CourseAssessmentDetailsController {

    @Autowired
    private CourseAssessmentDetailsService courseAssessmentDetailsService;

    @GetMapping
    public List<CourseAssessmentDetails> getAllCourseAssessmentDetails() {
        // Devuelve una lista de todos los detalles de evaluación de cursos
        return courseAssessmentDetailsService.getAllCourseAssessmentDetails();
    }

    @GetMapping("/{id}")
    public CourseAssessmentDetails getCourseAssessmentDetailsById(@PathVariable Long id) {
        // Obtiene un detalle de evaluación de cursos por su ID
        return courseAssessmentDetailsService.findById(id);
    }

    @PostMapping
    public CourseAssessmentDetails createCourseAssessmentDetails(@RequestBody CourseAssessmentDetails details) {
        // Crea un nuevo detalle de evaluación de cursos y lo guarda en la base de datos
        return courseAssessmentDetailsService.create(details);
    }

    @PutMapping("/{id}")
    public CourseAssessmentDetails updateCourseAssessmentDetails(@PathVariable Long id, @RequestBody CourseAssessmentDetails updatedDetails) {
        // Actualiza un detalle de evaluación de cursos existente por su ID
        return courseAssessmentDetailsService.update(id, updatedDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteCourseAssessmentDetails(@PathVariable Long id) {
        // Elimina un detalle de evaluación de cursos por su ID
        courseAssessmentDetailsService.delete(id);
    }
}
