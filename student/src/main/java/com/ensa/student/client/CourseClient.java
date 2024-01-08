package com.ensa.student.client;

import com.ensa.student.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="course-service")
public interface CourseClient {
    @GetMapping("/student/{courseId}")
    List<Student> findAllCoursesByStudent(@PathVariable("courseId") Integer courseId);
}
