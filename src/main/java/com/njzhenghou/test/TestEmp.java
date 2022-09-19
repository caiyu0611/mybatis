package com.njzhenghou.test;

import com.njzhenghou.entity.Cat;
import com.njzhenghou.entity.Dept;
import com.njzhenghou.entity.Emp;
import com.njzhenghou.mapper.CatMapper;
import com.njzhenghou.mapper.DeptMapper;
import com.njzhenghou.mapper.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class TestEmp {
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
            DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
            Dept deptById = mapper.getDeptById(2);
            System.out.println(deptById);
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
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            Emp empById = mapper.getEmpById(3);
            System.out.println(empById);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

