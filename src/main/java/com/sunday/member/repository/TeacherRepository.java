package com.sunday.member.repository;

import com.sunday.member.model.Teacher;
import org.springframework.stereotype.Repository;

/**
 * Created by novot on 2017-05-16.
 */
@Repository
public class TeacherRepository {

    public Teacher getTeacherInfo(long serial) {
        Teacher teacher = new Teacher();
        teacher.setName("홍길동");
        teacher.setCareer(5);
        return teacher;
    }
}
