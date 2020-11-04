package com.sutao;

import com.sutao.entity.Emp;
import com.sutao.mapper.EmpMapper;
import com.sutao.service.impl.EmpServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class EmpTest {

    @Test
    public void test() throws Exception{
        String resources = "mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(resources);
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = build.openSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.selectByPrimaryKey(7369);
        System.out.println(emp);
    }

    @Test
    public void serviceTest() {
        EmpServiceImpl e = new EmpServiceImpl();
        Emp emp = e.selectUserInfoByEmpno(7369);

    }
}
