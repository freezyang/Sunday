package com.sunday.member.controller;

import com.sunday.member.model.Teacher;
import com.sunday.member.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by novot on 2017-05-16.
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/info/{serial}")
    @ResponseBody
    public Teacher getTeacherInfo(@PathVariable("serial") long serial) {
        return teacherService.getTeacherInfo(serial);
    }
}
