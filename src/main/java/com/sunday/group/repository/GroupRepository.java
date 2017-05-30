package com.sunday.group.repository;

import com.sunday.common.BaseRepository;
import com.sunday.group.model.Group;
import org.springframework.stereotype.Repository;

/**
 * Created by novot on 2017-05-30.
 */
@Repository
public class GroupRepository extends BaseRepository {

    public GroupRepository() {
        super.prefix = "com.sunday.group.ChurchGroup.";
    }

    public int insert(Group group) {
        return sqlSession.insert(getSqlId("insert"), group);
    }

    public Group getChurchGroupInfo(long serial) {
        return sqlSession.selectOne(getSqlId("getChurchGroupInfo"), serial);
    }
}
