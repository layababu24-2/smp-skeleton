package com.iplus.studentManagement.Service;

import com.iplus.studentManagement.Entity.Course;
import com.iplus.studentManagement.Repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course saveCourse(Course course) {
        return this.courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return this.courseRepository.findAll();
    }

    public Optional<Course> getCourseById(Long id) {
        return this.courseRepository.findById(id);
    }

    public void deleteCourse(Long id) {
        this.courseRepository.deleteById(id);
    }

    public Optional<Course> getCourseByName(String name) {
        return this.courseRepository.findByCourseName(name);
    }
}