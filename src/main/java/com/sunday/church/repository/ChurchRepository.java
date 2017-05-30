package com.sunday.church.repository;

import com.sunday.church.model.Church;
import com.sunday.common.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by novot on 2017-05-28.
 */
@Repository
public class ChurchRepository extends BaseRepository {

    public ChurchRepository() {
        super.prefix = "com.sunday.church.Church.";
    }

    public int insert(Church church) {
        return sqlSession.insert("com.sunday.church.Church.insert", church);
    }

    public Church getChurchInfo(long churchSerial) {
        return sqlSession.selectOne("com.sunday.church.Church.getChurchInfo", churchSerial);
    }

    public List<Church> getChurchList() {
        return sqlSession.selectList("com.sunday.church.Church.getChurchList");
    }
}
