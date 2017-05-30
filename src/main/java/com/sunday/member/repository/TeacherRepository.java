package com.sunday.member.repository;

import com.sunday.common.BaseRepository;
import com.sunday.member.model.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Created by novot on 2017-05-16.
 */
@Repository
public class TeacherRepository extends BaseRepository {

    public TeacherRepository() {
        super.prefix = "com.sunday.member.Teacher.";
    }

    public Teacher getTeacherInfo(long serial) {
        return sqlSession.selectOne("com.sunday.member.Teacher.selectTeacherInfo", serial);
    }

    public int insert(Teacher teacher) {
        return sqlSession.insert("com.sunday.member.Teacher.insert", teacher);
    }
}
