package com.sutao.mapper;

import com.sutao.entity.Emp;

public interface EmpMapper extends BaseMapper {

    Emp selectByPrimaryKey(Integer empno);
}
