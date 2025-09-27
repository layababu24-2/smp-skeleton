package com.iplus.studentManagement.Service;

import com.iplus.studentManagement.Entity.Enrollment;
import com.iplus.studentManagement.Repository.EnrollmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentService(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    public Enrollment saveEnrollment(Enrollment enrollment) {
        return this.enrollmentRepository.save(enrollment);
    }

    public List<Enrollment> getAllEnrollments() {
        return this.enrollmentRepository.findAll();
    }

    public Optional<Enrollment> getEnrollmentById(Long id) {
        return this.enrollmentRepository.findById(id);
    }

    public void deleteEnrollment(Long id) {
        this.enrollmentRepository.deleteById(id);
    }
}