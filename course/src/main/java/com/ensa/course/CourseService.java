package com.ensa.course;

import com.ensa.course.client.StudentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository repository;
    private final StudentClient client;

    public void saveCourse(Course school) {
        repository.save(school);
    }

    public List<Course> findAllCourse() {
        return repository.findAll();
    }

    public FullCourseResponse findCoursesWithStudents(Integer courseId) {
        var course = repository.findById(courseId)
                .orElse(
                        Course.builder()
                                .title("NOT_FOUND")
                                .build()
                );
        var students = client.findAllStudentsByCourse(courseId);
        return FullCourseResponse.builder()
                .title(course.getTitle())
                .students(students)
                .build();
    }
}
