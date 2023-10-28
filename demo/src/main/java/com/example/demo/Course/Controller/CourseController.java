package com.example.demo.Course.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.Course.Service.CourseService;

@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;
    
}
