package com.sunday.member;

import com.sunday.member.model.Teacher;
import com.sunday.member.repository.TeacherRepository;
import com.sunday.member.type.Gender;
import com.sunday.member.type.Position;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

/**
 * Created by novot on 2017-05-30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void insert() {
        Teacher teacher = new Teacher();
        teacher.setName("양길완");
        teacher.setChristianName("바오로");
        teacher.setAge(35);
        teacher.setGender(Gender.M);
        teacher.setFestivitas("06-29");
        teacher.setBirthday(LocalDate.of(1983, 5, 12));
        teacher.setAddress("경기도 용인시 기흥구 구갈동 한양아파트 105동 107호");
        teacher.setZipcode("446-736");
        teacher.setCellPhone("010-7262-5850");
        teacher.setCareer(7);
        teacher.setPosition(Position.P4);
        teacher.setCreateWho("novot");

        int result = teacherRepository.insert(teacher);
        Assert.assertSame(result, 1);

    }

    @Test
    public void getTeacherInfo() {
        long serial = 1;
        Teacher teacher = teacherRepository.getTeacherInfo(serial);

        System.out.println(teacher);
        Assert.assertNotNull(teacher);
    }
}
