package com.example.demo.CourseAssessment.Domain;

import com.example.demo.Course.Domain.Course;
import com.example.demo.Periodo.Domain.Periodo;

import jakarta.persistence.*;

@Entity
public class CourseAssessment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String tipoNota;
    private String numNota;
    private String nomenclatura;

    @OneToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToOne
    @JoinColumn(name = "periodo_id")
    private Periodo periodo;

    public CourseAssessment(Long id, String title, String tipoNota, String numNota, String nomenclatura, Course course, Periodo periodo) {
        this.id = id;
        this.title = title;
        this.tipoNota = tipoNota;
        this.numNota = numNota;
        this.nomenclatura = nomenclatura;
        this.course = course;
        this.periodo = periodo;
    }

    public CourseAssessment() {}

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getTipoNota() {
        return tipoNota;
    }

    public String getNumNota() {
        return numNota;
    }

    public String getNomenclatura() {
        return nomenclatura;
    }

    public Course getCourse() {
        return course;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTipoNota(String tipoNota) {
        this.tipoNota = tipoNota;
    }

    public void setNumNota(String numNota) {
        this.numNota = numNota;
    }

    public void setNomenclatura(String nomenclatura) {
        this.nomenclatura = nomenclatura;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
}

