package com.wang.ORM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 	测试使用Object[]来封装一条数据 
 * +List封装多条记录
 * 
 * @author wangQ
 *
 * @date 2020-8-6
 */
public class Demo01 {
	public static void main(String[] args) {
		Connection connection = null;

		connection = JDBCUtil.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		Object[] objs = null;
		List<Object[]> list = new ArrayList<>();
		try {
			preparedStatement = connection.prepareStatement("select ename,salary,age from emp_info");
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				objs = new Object[3];
				objs[0] = resultSet.getObject(1);
				objs[1] = resultSet.getObject(2);
				objs[2] = resultSet.getObject(3);
				list.add(objs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(resultSet, preparedStatement, connection);
		}
		for (Object[] obj : list) {
			System.out.println(obj[0]);
		}
	}
}
