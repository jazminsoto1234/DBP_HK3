package com.example.demo.CourseType.Service;

import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.CourseType.Domain.CourseType;
import com.example.demo.CourseType.Domain.CourseTypeRepository;

@Service
public class CourseTypeService {
    @Autowired
    private CourseTypeRepository courseTypeRepository;

    public CourseType saveCourseType(CourseType courseType){
        return courseTypeRepository.save(courseType);
    }

    public CourseType  saveCourseType( CourseType  courseType ,Long id){
        Optional<CourseType> existe= courseTypeRepository.findById(id);
        if (existe.isPresent()){
            throw new RuntimeException("Ya existe un CourseType con este ID");   }
        else{
            courseType.setid(id);
            return  courseTypeRepository.save(courseType);
        }
    }

    public void deleteCourseTypeById(Long id) {
        courseTypeRepository.deleteById(id);
    }

    public CourseType partialUpdateCourseType(Long id ,  CourseType courseType ){
        Optional<CourseType> existeCourseType=  courseTypeRepository.findById(id);
        if (existeCourseType.isPresent()){
            BeanUtils.copyProperties( courseType, existeCourseType.get(), "id");
            return courseTypeRepository.save(existeCourseType.get());
        }
        return null;
    }
}
