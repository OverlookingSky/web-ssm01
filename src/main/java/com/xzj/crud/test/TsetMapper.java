package com.xzj.crud.test;

import java.util.UUID;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xzj.crud.bean.Department;
import com.xzj.crud.bean.Employee;
import com.xzj.crud.dao.DepartmentMapper;
import com.xzj.crud.dao.EmployeeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TsetMapper {

	@Autowired
	EmployeeMapper employeeMapper;
	
	@Autowired
	DepartmentMapper departmentMapper;	
	
	@Autowired
	SqlSession sqlSession;
	
	
	@Test
	public void text1(){
		//employeeMapper.insertSelective(new Employee("李林杰", 20, "llj@qq.com", 4));
		//departmentMapper.insertSelective(new Department(null,"特勤部"));
		long start = System.currentTimeMillis();
		 EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
		 for(int i=0;i<1000;i++){
			 String uuid = UUID.randomUUID().toString().substring(0, 5);
			 mapper.insertSelective(new Employee(uuid, 20, uuid+"@qq.com", 1));
		 }
		 long end = System.currentTimeMillis();
		 System.out.println(end-start);
		 System.out.println("批量完成");
	}
	
}
