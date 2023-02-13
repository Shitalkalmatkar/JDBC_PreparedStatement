package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.dto.Employee;
import com.jsp.helper.HelperClass;

public class EmployeeDao {
HelperClass helperclass=new HelperClass();


//_________________________INSERT________________________________________---



public Employee saveEmployees (Employee employee) {
	Connection connection= helperclass.getConnection();
	String sql="INSERT INTO employees VALUES(?,?,?)";
	try {
		PreparedStatement preparedStatement= connection.prepareStatement(sql);
		preparedStatement.setInt(1, employee.getId());
		preparedStatement.setString(2, employee.getName());
		preparedStatement.setLong(3, 8987665435l);
		
		preparedStatement.execute();
		//System.out.println(employee.getId()+"HAS BEEN SAVED");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return employee;
}

//___________________________________Delete__________________________________________________
public Employee deleteEmployees( Employee employee) {
	Connection connection=helperclass.getConnection();
	
	String sql= "DELETE FROM employees WHERE ID=?";
	
	try {
		PreparedStatement preparedStatement =connection.prepareStatement(sql);
		preparedStatement.setInt(1, employee.getId());
		preparedStatement.execute();
		connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return employee;
	
}

//_____________________________________UPDATE___________________________________________________

public Employee updateEmployees(Employee employee) {
	Connection connection=helperclass.getConnection();
	
	String sql = "UPDATE employees SET NAME=? WHERE ID=?";
	
	try {
		PreparedStatement preparedStatement= connection.prepareStatement(sql);
		preparedStatement.setInt(1, employee.getId());
		preparedStatement.setString(2, employee.getName());
		preparedStatement.execute();
		connection.close();
		System.out.println("YOUR RECORD HAS BEEN UPDATED");
				
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return employee;
	
	
}








}
