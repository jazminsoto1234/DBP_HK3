package com.example.demo.CourseAssessmentDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CourseAssessmentDetailsServiceImpl implements CourseAssessmentDetailsService {

    @Autowired
    private CourseAssessmentDetailsRepository repository;

    @Override
    public List<CourseAssessmentDetails> getAllCourseAssessmentDetails() {
        // Devuelve una lista de todos los detalles de evaluación de cursos
        return repository.findAll();
    }

    @Override
    public CourseAssessmentDetails findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public CourseAssessmentDetails create(CourseAssessmentDetails details) {
        return repository.save(details);
    }

    @Override
    public CourseAssessmentDetails update(Long id, CourseAssessmentDetails updatedDetails) {

        CourseAssessmentDetails existingDetails = repository.findById(id).orElse(null);
        if (existingDetails != null) {
            // Actualiza los campos necesarios del detalle de evaluación existente
            existingDetails.setScore(updatedDetails.getScore());
            existingDetails.setSeccion(updatedDetails.getSeccion());
            existingDetails.setSecciongrup(updatedDetails.getSecciongrup());

            // Guarda la actualización en la base de datos
            return repository.save(existingDetails);
        } else {
            // Devuelve null u otro valor apropiado si el detalle de evaluación no se encontró
            return null;
        }
    }

    @Override
    public void delete(Long id) {
        // Implementa la lógica para eliminar un detalle de evaluación por ID
        repository.deleteById(id);
    }
}
