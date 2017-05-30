package com.sunday.member.repository;

import com.sunday.common.BaseRepository;
import com.sunday.member.model.Student;
import org.springframework.stereotype.Repository;

/**
 * Created by novot on 2017-05-16.
 */
@Repository
public class StudentRepository extends BaseRepository {

    public StudentRepository() {
        super.prefix = "com.sunday.member.Student.";
    }

    public int insert(Student student) {
        return sqlSession.insert(getSqlId("insert"), student);
    }

    public Student getStudentInfo(long serial) {
        return sqlSession.selectOne(getSqlId("getStudentInfo"), serial);
    }
}
