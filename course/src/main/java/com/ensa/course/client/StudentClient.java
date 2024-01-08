package com.ensa.course.client;

import com.ensa.course.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="student-service")
public interface StudentClient {

    @GetMapping("/course/{course-id}")
    List<Student> findAllStudentsByCourse(@PathVariable("course-id") Integer schoolId);
}
