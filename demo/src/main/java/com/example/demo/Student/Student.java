package com.example.demo.Student;
import com.example.demo.Course.Domain.Course;
import com.fasterxml.jackson.annotation.*;


import java.util.Set;
import jakarta.persistence.*;

@Entity
@JsonIdentityInfo(
  generator = ObjectIdGenerators.PropertyGenerator.class, 
  property = "id")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private String code;
    private String area; //Debe ser entidad. No se si se puede dejar como String

    //@OneToOne
    //@JoinColumn(name = "course_id")
    //private Course course;

   /////me flata
    
    //private CourseAssessmentDetails course_a_d;

    public Student(){};
    public Student(String name, String email, String code, String area){
        this.name=name;
        this.email=email;
        this.code=code;
    }

    public void setName (String name ){
        this.name=name;
    }

    public void setEmail (String email ){
        this.email=email;
    }

    public void setCode (String code ){
        this.code=code;
    }

    public void setArea (String area ){
        this.area=area;
    }

    public void setId (Long id  ){
        this.id=id;
    }

    public Long getId (){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getCode(){
        return code;
    }

    public String getArea(){
        return area;
    }

}
