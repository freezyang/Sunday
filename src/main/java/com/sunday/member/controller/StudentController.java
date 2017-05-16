package com.sunday.member.controller;

import com.sunday.member.model.Student;
import com.sunday.member.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by novot on 2017-05-16.
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    private final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @RequestMapping("/info/{serial}")
    @ResponseBody
    public Student getStudentInfo(@PathVariable("serial") long serial) {
        return studentService.getStudentInfo(serial);
    }

}
