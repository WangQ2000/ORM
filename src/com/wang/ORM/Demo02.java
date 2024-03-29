package com.wang.ORM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 	测试使用Map<K,V>来封装一条数据
 * +List封装多条记录
 * @author wangQ
 *
 * @date 2020-8-6
 */
public class Demo02 {
	public static void main(String[] args) {
		Connection connection = null;

		connection = JDBCUtil.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		Map<String, Object> rows = null;
		List<Map<String, Object>> list = new ArrayList<>();
		try {
			preparedStatement = connection.prepareStatement("select ename,salary,age from emp_info");
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				rows = new HashMap<String, Object>();
				rows.put("ename", resultSet.getObject(1));
				rows.put("salary", resultSet.getObject(2));
				rows.put("age", resultSet.getObject(3));
				list.add(rows);
			}	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(resultSet, preparedStatement, connection);
		}
		for(Map<String, Object> mapO:list) {
			System.out.println(mapO.get("ename"));
		}
	}
}
