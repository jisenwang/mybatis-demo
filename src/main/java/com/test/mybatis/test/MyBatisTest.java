//package com.test.mybatis.test;
//
//import com.test.mybatis.entity.Employee;
//import com.test.mybatis.mapper.EmployeeMapper;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.jupiter.api.Test;
//
//import java.io.IOException;
//import java.io.InputStream;
//
//class MyBatisTest {
//
//	//创建SqlSessionFactory的方法
//	public SqlSessionFactory getSqlSessionFactory() throws IOException {
//		String resource = "mybatis-config.xml";
//		InputStream inputStream = Resources.getResourceAsStream(resource);
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		return sqlSessionFactory;
//	}
//
//	//★面向Mapper接口开发：通过Mapper接口的方式获取Employee
//	@Test
//	void testMapper() throws IOException {
//		// 1.获取SqlSessionFactory对象
//		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
//		// 2.获取SqlSession，相当于JDBC中的Connection
//		SqlSession session = sqlSessionFactory.openSession();
//		try {
//			// 3.获取Mapper对象
//			EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
//			//4.调用employeeMapper中获取一个对象的方法
//			Employee employeeById = employeeMapper.getEmployeeById(1);
//			System.out.println(employeeById);
//		} finally {
//			//5.关闭sqlSession
//			session.close();
//		}
//	}
//
//	//使用MyBatis原生API：获取Employee
//	@Test
//	void testGetEmp() throws IOException {
//		//1.获取SqlSessionFactory
//		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
//		//2.获取SqlSession对象
//		SqlSession session = sqlSessionFactory.openSession();
//		try {
//			//3.直接调用selectOne方法获取Employee
//			Employee employee = session.selectOne("getEmployeeById", 1);
//			System.out.println(employee);
//			 }
//			 finally {
//				//4.关闭sqlSession
//				session.close();
//			}
//	}
//
//}
