package com.example.demo.Periodo.Domain;

import java.util.Set;

import com.example.demo.CourseAssessment.Domain.CourseAssessment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class Periodo {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String code;

    

    public Periodo(){}

    public Periodo(Long id, String name, String code){
        this.id = id; this.name= name; this.code = code;
    }

    public Long getid(){
        return this.id;
    }

    public String getname(){
        return this.name;
    }

    public String getcode(){
        return this.code;
    }

    public void setid(Long id){this.id = id;}
    public void setname(String name){this.name = name;}
    public void setcode(String code){this.code = code;}
    
    
}
