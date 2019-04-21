package com.cc.test;

import com.cc.Util.MybatisUtils;
import com.cc.po.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


public class YddTest {
    @Test
    public void findUserTest() {
        SqlSession session = MybatisUtils.getSqlSession(true);
        User user = session.selectOne("com.cc.mapper" + "UserMapper.findUserWithOrders", 1);
        System.out.println(user);
        session.close();
    }
}
