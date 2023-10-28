package com.example.demo.CourseType.Domain;


import com.example.demo.CourseType.Domain.CourseType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class CourseType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

   


    //@OneToOne
    //@JoinColumn(name = "CourseType_id") // Uno a uno con la entidad 2
    //private CourseType courseType;

    public CourseType(){}

    public CourseType(Long id, String name ){
        this.id = id;
        this.name = name;
    }

    public Long getid(){
        return this.id;
    }

    public String getname(){
        return this.name;
    }

    public void setid(Long id){
        this.id = id;
    }

    public void setname(String name){
        this.name = name;
    }


    


}
