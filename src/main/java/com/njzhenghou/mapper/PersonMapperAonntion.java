package com.njzhenghou.mapper;

import com.njzhenghou.entity.Person;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface PersonMapperAonntion {

    @Insert("insert into person (`name`,age,birth,registerTime,salary)value (#{name},#{age},#{birth},#{registerTime},#{salary})")
    public void insertPerson(Person person);

    @Delete("delete from person where id=#{id}")
    public void deletePersonById(Integer id);

    @Update("update person set `name`=#{name},age=#{age},birth=#{birth},registerTime=#{registerTime},salary=#{salary} where id=#{id}")
    public void updatePerson(Person person);

    @Select("select * from person where id=#{id}")
    public Person selectOne(Integer id);

    @Select("select * from person")
    public List<Person> selectAll();

}
