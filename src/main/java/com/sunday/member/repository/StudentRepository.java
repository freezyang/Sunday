package com.sunday.member.repository;

import com.sunday.member.model.Student;
import org.springframework.stereotype.Repository;

/**
 * Created by novot on 2017-05-16.
 */
@Repository
public class StudentRepository {

    public Student getStudentInfo(long serial) {
        Student student = new Student();
        student.setName("이만복");
        student.setAge(8);

        return student;
    }
}
