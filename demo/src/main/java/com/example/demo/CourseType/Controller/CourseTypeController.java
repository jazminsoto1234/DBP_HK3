package com.example.demo.CourseType.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.CourseType.Service.CourseTypeService;

@Controller
public class CourseTypeController {
    @Autowired
    private CourseTypeService courseService;
    
}
