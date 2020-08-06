package com.wang.ORM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 	测试使用javabean对象来封装一条数据 +List封装多条记录
 * 
 * @author wangQ
 *
 * @date 2020-8-6
 */
public class Demo04 {
	public static void main(String[] args) {
		Connection connection = null;

		connection = JDBCUtil.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Emp_info  emp_info = null;
		List<Emp_info> list = new ArrayList<Emp_info>();
		try {
			preparedStatement = connection.prepareStatement("select ename,salary,age from emp_info");
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				emp_info = new Emp_info(resultSet.getString(1),resultSet.getInt(3),resultSet.getDouble(2));
				list.add(emp_info);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(resultSet, preparedStatement, connection);
		}
		for (Emp_info emp:list) {
			System.out.println(emp.toString());
		}
	}
}
