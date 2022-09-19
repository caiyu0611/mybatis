package com.njzhenghou.test;

import com.njzhenghou.entity.Key;
import com.njzhenghou.entity.Lock;
import com.njzhenghou.mapper.KeyMapper;
import com.njzhenghou.mapper.LockMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class TestLock {
    String resource = "mybatis-config.xml";
    InputStream inputStream = null;

    /**
     * 查询一个
     */
    @Test
    public void selectOne(){
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            LockMapper mapper = sqlSession.getMapper(LockMapper.class);
            Lock lockById = mapper.getLockById(2);
            System.out.println(lockById);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void select(){
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            LockMapper mapper = sqlSession.getMapper(LockMapper.class);
            Lock lockById2 = mapper.getLockById2(101);
            System.out.println(lockById2);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

