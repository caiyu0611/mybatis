package com.njzhenghou.test;

import com.njzhenghou.entity.Cat;
import com.njzhenghou.entity.User;
import com.njzhenghou.mapper.CatMapper;
import com.njzhenghou.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class TestUser {
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
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.selectUserById(1);
            System.out.println(user);

//            User user1 = mapper.selectUserById(1);
//            System.out.println(user1);
//

            sqlSession.close();
            sqlSession = sqlSessionFactory.openSession();
            mapper = sqlSession.getMapper(UserMapper.class);
            User user1 = mapper.selectUserById(1);
            System.out.println(user1);

//            sqlSession.clearCache();
//            User user1 = mapper.selectUserById(1);
//            System.out.println(user1);

//            mapper.updateUser(new User(1,"lisi",100));
//            sqlSession.commit();
//            User user1 = mapper.selectUserById(1);
//            System.out.println(user1);
            sqlSession.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

