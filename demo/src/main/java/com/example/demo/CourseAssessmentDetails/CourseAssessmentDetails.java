package com.example.demo.CourseAssessmentDetails;
import com.example.demo.Course.Domain.Course;
import com.example.demo.CourseAssessment.Domain.CourseAssessment;
import com.example.demo.Professor.Professor;
import com.example.demo.Student.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Periodo")
public class CourseAssessmentDetails {
    @Id
    private Long id;
    private String Score;
    private String seccion;
    private String secciongrup;
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @OneToOne
    @JoinColumn(name = "professor_id")
    private Professor profesor;

    @OneToOne
    @JoinColumn(name = "course_assessment_id")
    private CourseAssessment CourseAssessment;

    public CourseAssessmentDetails(){};
    public CourseAssessmentDetails(Long id, String score, String seccion, String secciongrup, Student student, Professor profesor, com.example.demo.CourseAssessment.Domain.CourseAssessment courseAssessment) {
        this.id = id;
        Score = score;
        this.seccion = seccion;
        this.secciongrup = secciongrup;
        this.student = student;
        this.profesor = profesor;
        CourseAssessment = courseAssessment;
    }

    public Long getId() {
        return id;
    }

    public String getScore() {
        return Score;
    }

    public String getSeccion() {
        return seccion;
    }

    public String getSecciongrup() {
        return secciongrup;
    }

    public Student getStudent() {
        return student;
    }

    public Professor getProfesor() {
        return profesor;
    }

    public com.example.demo.CourseAssessment.Domain.CourseAssessment getCourseAssessment() {
        return CourseAssessment;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setScore(String score) {
        Score = score;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void setSecciongrup(String secciongrup) {
        this.secciongrup = secciongrup;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setProfesor(Professor profesor) {
        this.profesor = profesor;
    }

    public void setCourseAssessment(com.example.demo.CourseAssessment.Domain.CourseAssessment courseAssessment) {
        CourseAssessment = courseAssessment;
    }
}
