package com.njzhenghou.mapper;

import com.njzhenghou.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentMapper {

    public void updateStudent(Student student);

    public void insertByTrim(Map<String ,Object> map);

    public List<Student> getStudentByTrim(Student student);

    public List<Student> getStudent_foreach(Map<String,Object> map);

    public List<Student> getStudent_choose(Map<String,Object> map);

    public List<Student> getStudent_where(Student student);

    public List<Student> getByAge_if(@Param("age") int age);

    public List<Student> getByAge(int age);

}
