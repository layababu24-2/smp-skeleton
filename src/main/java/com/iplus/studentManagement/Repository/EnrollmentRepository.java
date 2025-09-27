package com.iplus.studentManagement.Repository;

import com.iplus.studentManagement.Entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}