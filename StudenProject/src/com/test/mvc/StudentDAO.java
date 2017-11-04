package com.test.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	
	public List<Student> getAll(){
		List<Student> students = new ArrayList<Student>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			String driverClas = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql:///user_test";
			String user = "root";
			String password = "2098231.xzm";
			
			Class.forName(driverClas);
			connection = DriverManager.getConnection(url, user, password);
			String sql = "SELECT name, age,emill FROM students";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				String name = resultSet.getString(1);
				int age = resultSet.getInt(2);
				String emill = resultSet.getString(3);
				Student student = new Student(name, age, emill);
				students.add(student);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(resultSet != null){
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(preparedStatement != null){
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(connection != null){
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return students;
	}
	                               
}
