package com.sutao.service.impl;

import com.sutao.entity.Emp;
import com.sutao.mapper.EmpMapper;
import com.sutao.service.EmpService;
import com.sutao.utils.MybatisUtils;

public class EmpServiceImpl implements EmpService {

    @Override
    public Emp selectUserInfoByEmpno(Integer empno) {
        EmpMapper mapper = MybatisUtils.getMapper(EmpMapper.class);
        Emp emp = mapper.selectByPrimaryKey(empno);
        System.out.println(emp);
        return emp;
    }
}
