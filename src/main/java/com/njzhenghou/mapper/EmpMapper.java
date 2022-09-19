package com.njzhenghou.mapper;

import com.njzhenghou.entity.Cat;
import com.njzhenghou.entity.Emp;

import java.util.List;

public interface EmpMapper {
    ////为部门查询服务，从一的一端查询，协助按照deptId查询并获得所有员工
    //输入部门的id,输出这个部门的员工
    List<Emp> getEmpByDeptId(Integer deptId);

    //为员工查询服务，查出该员工信息+属于哪个部门
    Emp getEmpById(Integer id);
}
