package com.iplus.studentManagement.Controller;

import com.iplus.studentManagement.Entity.Enrollment;
import com.iplus.studentManagement.Service.EnrollmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

    private final EnrollmentService enrollmentService;

    public EnrollmentController(EnrollmentService enrollmentService) {
        this.enrollmentService = enrollmentService;
    }

    @PostMapping
    public Enrollment addEnrollment(@RequestBody Enrollment enrollment) {
        return this.enrollmentService.saveEnrollment(enrollment);
    }

    @GetMapping
    public List<Enrollment> getAllEnrollments() {
        return this.enrollmentService.getAllEnrollments();
    }

    @GetMapping("/{id}")
    public Optional<Enrollment> getEnrollment(@PathVariable Long id) {
        return this.enrollmentService.getEnrollmentById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteEnrollment(@PathVariable Long id) {
        this.enrollmentService.deleteEnrollment(id);
        return "Enrollment deleted with id: " + id;
    }
}