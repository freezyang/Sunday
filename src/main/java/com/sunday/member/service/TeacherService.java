package com.sunday.member.service;

import com.sunday.member.model.Teacher;
import com.sunday.member.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by novot on 2017-05-16.
 */
@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher getTeacherInfo(long serial) {
        return teacherRepository.getTeacherInfo(serial);
    }
}
