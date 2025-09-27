package com.iplus.studentManagement.Controller;

import com.iplus.studentManagement.Entity.Course;
import com.iplus.studentManagement.Service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.saveCourse(course);
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return this.courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Optional<Course> getCourse(@PathVariable Long id) {
        return this.courseService.getCourseById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable Long id) {
        this.courseService.deleteCourse(id);
        return "Course deleted with id: " + id;
    }
}