package com.sunday.group;

import com.sunday.group.model.Group;
import com.sunday.group.repository.GroupRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by novot on 2017-05-30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupRepositoryTest {

    @Autowired
    private GroupRepository groupRepository;

    @Test
    public void insert() {
        Group group = new Group();
        group.setChurchSerial(1);
        group.setName("중고등부 교사회");

        int result = groupRepository.insert(group);
        Assert.assertSame(result, 1);
    }

}
