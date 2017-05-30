package com.sunday.group.service;

import com.sunday.group.model.Group;
import com.sunday.group.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by novot on 2017-05-30.
 */
@Service
public class GroupService {

    @Autowired
    private GroupRepository groupRepository;

    public int insert(Group group) {
        return groupRepository.insert(group);
    }

    public Group getChurchGroupInfo(long serial) {
        return groupRepository.getChurchGroupInfo(serial);
    }
}
