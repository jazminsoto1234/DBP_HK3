package com.example.demo.Professor;
import com.example.demo.Course.Domain.Course;
import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import org.springframework.stereotype.Service;
import java.util.Set;

@Entity
@JsonIdentityInfo(
  generator = ObjectIdGenerators.PropertyGenerator.class, 
  property = "id")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String lastName;
    private String email;
    private String fullName;

    @OneToOne
    @JoinColumn(name = "course_id")
    private Course course;

    
    //private CourseAssessmentDetails course_a_d;

    public Professor(){};
    public Professor(String name, String lastName, String email, String fullName){
        this.name=name;
        this.lastName=lastName;
        this.email=email;
        this.fullName=fullName;
    }

    public void setName (String name ){
        this.name=name;
    }

    public void setLastName (String lastName ){
        this.lastName=lastName;
    }

    public void setEmail (String email ){
        this.email=email;
    }

    public void setFullName (String fullName ){
        this.fullName=fullName;
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

    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }

    public String getFullName(){
        return fullName;
    }

}
