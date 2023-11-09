package com.henriqueacf.apispring.controller;

import com.henriqueacf.apispring.model.Course;
import com.henriqueacf.apispring.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

//    @Autowired
    private final CourseRepository courseRepository;

//    public CourseController(CourseRepository courseRepository) {
//        this.courseRepository = courseRepository;
//    }

    @GetMapping
    public List<Course> list(){
        return courseRepository.findAll();
    }
}
