package com.cadio.jdbc;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/junit-context.xml"})
public class JDBCTest {
	
	@Resource(name = "dataSource")
	private DataSource ds;
	@Resource(name = "sqlSessionFactory")
	private SqlSessionFactory sqlSessionFactory;
	@Resource(name = "sqlSession")
	private SqlSession sqlSession;
	
	@Test
	public void testDataSource() {
		assertNotNull(ds); 
	}
	
	@Test
	public void testSqlSessionFactory() {
		assertNotNull(sqlSessionFactory);
	}
	
	@Test
	public void testSqlSession() {
		assertNotNull(sqlSession);
	}
	
}
