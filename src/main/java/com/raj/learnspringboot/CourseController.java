package com.raj.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    ArrayList<Course> courses = new ArrayList<>();

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "in28Minutes"),
                new Course(2, "Learn Spring", "in28Minutes"),
                new Course(3, "Learn Cloud New", "in28Minutes"),
                new Course(4, "Learn Cloud New", "in28Minutes"),
                new Course(4, "Learn Cloud New", "in28Minutes")
        );
    }

}
