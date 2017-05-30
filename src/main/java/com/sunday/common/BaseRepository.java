package com.sunday.common;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by novot on 2017-05-28.
 */
public class BaseRepository {

    @Autowired
    @Qualifier("sqlSessionTemplate")
    protected SqlSession sqlSession;

    protected String prefix;

    protected String getSqlId(String id) {
        return prefix + id;
    }

}
