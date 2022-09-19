package com.njzhenghou.test;

import com.njzhenghou.entity.Cat;
import com.njzhenghou.entity.Person;
import com.njzhenghou.mapper.CatMapper;
import com.njzhenghou.mapper.PersonMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;


public class TestCat {
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
            CatMapper mapper = sqlSession.getMapper(CatMapper.class);
            //查询一个
            Cat catByConditions = mapper.getCatByConditions(new Cat(1,null,7,null));
            System.out.println(catByConditions);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

