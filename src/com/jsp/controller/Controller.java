package com.jsp.controller;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class Controller {
public static void main(String[] args) {
	Employee employyee =new Employee();
	employyee.setId(111);
	employyee.setName("jack");
	employyee.setContact_no(7635423212l);
	EmployeeDao employeeDao=new EmployeeDao();
	employeeDao.saveEmployees(employyee);
}
}
