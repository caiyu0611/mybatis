package com.njzhenghou.mapper;

import com.njzhenghou.entity.Dept;

public interface DeptMapper {
    //输入id返回Dept对象,并输出这个部门的员工
    Dept getDeptById(Integer id);


}
