package cn.com.mybatis.datasource;

import java.io.IOException;
import java.io.InputStream;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataConnection {
	private String resource = "SqlMapConfig.xml";
	private SqlSessionFactory sqlSessionFactory;
	
	
	private SqlSession sqlSession;
	
	
	public SqlSession getSqlSession() throws IOException{
		InputStream inputStream =org.apache.ibatis.io.Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sqlSession = sqlSessionFactory.openSession();
			System.out.println();
		return sqlSession;
	}
}
