package com.example.demo.Course.Domain;


import com.example.demo.CourseType.Domain.CourseType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer credits;

    private String courseContened;

    private String code;

    private String area;

    private String HRGroup;

    private Integer cycle;

    

    @OneToOne
    @JoinColumn(name = "tipo_curso_id")
    private CourseType courseType;

    
    public Course(){}

    public Course(Long id, String name, Integer credits, String courseContened, String code, String area, String HRGroup, Integer cycle){
        this.id= id;
        this.name = name;
        this.credits = credits;
        this.courseContened = courseContened;
        this.code = code;
        this.HRGroup = HRGroup;
        this.area = area;
        this.cycle = cycle;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public String getCourseContened() {
        return courseContened;
    }

    public void setCourseContened(String courseContened) {
        this.courseContened = courseContened;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    public String getHRGroup() {
        return HRGroup;
    }

    public void setHRGroup(String HRGroup) {
        this.HRGroup = HRGroup;
    }

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }
}



/*
TODO EN LA CAPA SERVICE
public UsuarioDTO mapUsuarioToUsuarioDTO(Usuario usuario) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setId(usuario.getId());
        usuarioDTO.setNombre(usuario.getNombre());
        usuarioDTO.setCorreo(usuario.getCorreo());
        return usuarioDTO;
}

public UsuarioDTO getUsuarioDTOById(Long id) {
        Usuario usuario = usuarioRepository.findById(id).orElse(null);
        if (usuario != null) {
            return mapUsuarioToUsuarioDTO(usuario);
        }
        return null;
}

*/