package com.sutao.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {

    private static final String SOURCE_NAME = "mybatis-config.xml";

    private static final Logger LOG =  Logger.getLogger(MybatisUtils.class);

    public static<T> T getMapper(Class<T> clazz) {
        if (null == clazz) {
            throw new NullPointerException("Method param is null");
        }
        T result;
        InputStream is = null;
        SqlSession sqlSession = null;
        try {
            is = Resources.getResourceAsStream(SOURCE_NAME);
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            sqlSession = build.openSession();
            result = sqlSession.getMapper(clazz);
        } catch (IOException e) {
            LOG.error("Read Mybatis-config Error", e);
            e.printStackTrace();
            return null;
        }
        if (null == result) {
            throw new MapperReflexException("Constructor Mapper Error");
        }
        return result;
    }
    
    private static class MapperReflexException extends RuntimeException {
        private MapperReflexException() {
            super();
        }
        private MapperReflexException(String message) {
            super(message);
        }
    }
}
