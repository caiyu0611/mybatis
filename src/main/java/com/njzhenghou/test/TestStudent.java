package com.njzhenghou.test;


import com.njzhenghou.entity.Student;
import com.njzhenghou.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class TestStudent {

    String resource = "mybatis-config.xml";
    InputStream inputStream = null;

    @Test
    public void select(){
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> students = mapper.getByAge(22);
            System.out.println(students);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void select_if(){
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> students = mapper.getByAge_if(22);
            System.out.println(students);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void select_where(){
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            Student student = new Student();
//            student.setName("li4");
            student.setScore(89.5);
            List<Student> student_where = mapper.getStudent_where(student);
            System.out.println(student_where);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void select_choose(){
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            HashMap<String, Object> map = new HashMap<>();
//            map.put("name","li4");
            map.put("age",22);
            List<Student> student_choose = mapper.getStudent_choose(map);
            System.out.println(student_choose);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void select_foreach(){
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            HashMap<String, Object> map = new HashMap<>();
            map.put("ages", Arrays.asList(22, 23, 24));
            List<Student> student_foreach = mapper.getStudent_foreach(map);
            System.out.println(student_foreach);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void select_trim(){
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            Student student = new Student();
            student.setAge(23);
//            student.setName("li4");
            List<Student> student1 = mapper.getStudentByTrim(student);
            System.out.println(student1);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void insert_trim(){
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            HashMap<String, Object> map = new HashMap<>();
            map.put("name","zs1999");
            mapper.insertByTrim(map);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void update_set(){
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            Student student = new Student();
            student.setId(1);
            student.setName("zzzz4");
//          student.setBrith(new Date());
            mapper.updateStudent(student);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

