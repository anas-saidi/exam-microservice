package com.ensa.course;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullCourseResponse {

    private String title;
    List<Student> students;
}
