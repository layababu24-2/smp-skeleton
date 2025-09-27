package com.iplus.studentManagement.Service;

import com.iplus.studentManagement.Entity.Student;
import com.iplus.studentManagement.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {
        return this.studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return this.studentRepository.findById(id);
    }

    public void deleteStudent(Long id) {
        this.studentRepository.deleteById(id);
    }
}