package com.njzhenghou.mapper;

import com.njzhenghou.entity.Person;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface PersonMapper {


    public void insertPerson(Person person);

    public void deletePersonById(Integer id);

    public void updatePerson(Person person);

    public Person selectOne(Integer id);

    public List<Person> selectAll();

}
