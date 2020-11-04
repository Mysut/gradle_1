package com.sutao.service;

import com.sutao.entity.Emp;

public interface EmpService {

    Emp selectUserInfoByEmpno(Integer empno);
}
