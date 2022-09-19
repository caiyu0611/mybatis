package com.njzhenghou.test;

import com.njzhenghou.entity.Person;
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


public class TestAny {
    String resource = "mybatis-config.xml";
    InputStream inputStream = null;


    /**
     * 增加
     */
    @Test
    public void insert(){
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
            //增加
            mapper.insertPerson(new Person(null,"赵六",21111118,new Date(),new Date(),8000.5));
            //查询所有
            List<Person> people = mapper.selectAll();
            System.out.println(people);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 删除
     */
    @Test
    public void delete(){
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
            //删除
            mapper.deletePersonById(3);
            //查询所有
            List<Person> people = mapper.selectAll();
            System.out.println(people);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 修改
     */
    @Test
    public void update(){
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
            //修改
            mapper.updatePerson(new Person(1,"李四",30,new Date(),new Date(),10000.5));
            //查询所有
            List<Person> people = mapper.selectAll();
            System.out.println(people);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 查询一个
     */
    @Test
    public void selectOne(){
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
            //查询一个
            Person person = mapper.selectOne(1);
            System.out.println(person);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

