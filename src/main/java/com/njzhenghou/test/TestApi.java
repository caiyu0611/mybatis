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


public class TestApi {
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
            //使用API调用mapper接口里的增加方法
            sqlSession.insert("com.njzhenghou.mapper.PersonMapper.insertPerson",new Person(null,"孙七",30,new Date(),new Date(),10000.5));
            //增加
//            mapper.insertPerson(new Person(null,"赵六",28,new Date(),new Date(),8000.5));
            //查询所有
//            List<Person> people = mapper.selectAll();
//            System.out.println(people);
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
            //使用API调用mapper接口里的删除方法
            sqlSession.delete("com.njzhenghou.mapper.PersonMapper.deletePersonById",6);
//            PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
//            //删除
//            mapper.deletePersonById(3);
//            //查询所有
//            List<Person> people = mapper.selectAll();
//            System.out.println(people);
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
            //使用API调用mapper接口里的修改方法
            sqlSession.update("com.njzhenghou.mapper.PersonMapper.updatePerson",new Person(1,"李四",33,new Date(),new Date(),14000.5));
//            PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
//            //修改
//            mapper.updatePerson(new Person(1,"李四",30,new Date(),new Date(),10000.5));
//            //查询所有
//            List<Person> people = mapper.selectAll();
//            System.out.println(people);
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
            //使用API调用mapper接口里的查询一个方法
            Person person = sqlSession.selectOne("com.njzhenghou.mapper.PersonMapper.selectOne", 1);
            System.out.println(person);
//            PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
//            //查询一个
//            Person person = mapper.selectOne(1);
//            System.out.println(person);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void selectAll(){
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //使用API调用mapper接口里的查询一个方法
            List<Person> person = sqlSession.selectList("com.njzhenghou.mapper.PersonMapper.selectAll");
            System.out.println(person);
//            PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
//            //查询一个
//            Person person = mapper.selectOne(1);
//            System.out.println(person);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

