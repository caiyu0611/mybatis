package com.njzhenghou.test;

import com.njzhenghou.entity.Cat;
import com.njzhenghou.entity.Key;
import com.njzhenghou.mapper.CatMapper;
import com.njzhenghou.mapper.KeyMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class TestKey {
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
            KeyMapper mapper = sqlSession.getMapper(KeyMapper.class);
            Key keyById = mapper.getKeyById(1);
            System.out.println(keyById);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

