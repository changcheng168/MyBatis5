package com.cc.test;

import com.cc.Util.MybatisUtils;
import com.cc.po.Person;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class YdyTest{
    //嵌套查
    @Test
    public void findPersonByIdTest() {

            SqlSession session = MybatisUtils.getSqlSession(true);
            Person person = session.selectOne("com.cc.mapper." + "PersonMapper.findPersonById", 1);
            System.out.println(person);
            session.close();

    }

}
