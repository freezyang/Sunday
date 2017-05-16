package com.sunday.member.service;

import com.sunday.member.controller.StudentController;
import com.sunday.member.model.Student;
import com.sunday.member.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by novot on 2017-05-16.
 */
@Service
public class StudentService {
    private final Logger logger = LoggerFactory.getLogger(StudentService.class);

    @Autowired
    private StudentRepository studentRepository;

    public Student getStudentInfo(long serial) {
        return studentRepository.getStudentInfo(serial);
    }
}
