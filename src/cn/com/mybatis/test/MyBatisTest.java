package cn.com.mybatis.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.com.mybatis.datasource.DataConnection;
import cn.com.mybatis.po.User;

public class MyBatisTest {
	public DataConnection dataConn = new DataConnection();
	@Test
	public void TestSelect() throws IOException{
		
		SqlSession sqlSession = dataConn.getSqlSession();
		User user = sqlSession.selectOne("test.findUserById", 1);
		System.out.println("===="+user.getId()+"===="+user.getCity()+"===="+user.getGender()+"====");
		System.out.println(user.getBirthday());
		System.out.println(user.getPassword());
		System.out.println(user.getEmail());
		sqlSession.close();
		
	}
}
