package com.sutao.controller;

import com.sutao.entity.Emp;
import com.sutao.service.EmpService;
import com.sutao.service.impl.EmpServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GradleController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String empno = req.getParameter("empno");
        EmpService es = new EmpServiceImpl();
        Emp emp = es.selectUserInfoByEmpno(Integer.parseInt(empno));
        req.setAttribute("emp", emp);
        req.getRequestDispatcher("/WEB-INF/page/empInfo.jsp").forward(req, resp);
    }
}
