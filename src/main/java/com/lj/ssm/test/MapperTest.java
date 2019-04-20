package com.lj.ssm.test;

import java.applet.AppletContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lj.ssm.dao.StudentsMapper;
import com.lj.ssm.dao.TeacherMapper;

/**
 * 测试dao层的工作
 * 
 * @author liu
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	/**
	 * 测试StudentMapper
	 */
	@Autowired
	StudentsMapper studentsMapper;
	@Test
	public void testCRUD() {
		
	/*	// 1c创建springIoc容器
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2从容器中获取mapper
		TeacherMapper bean=ioc.getBean(TeacherMapper.class);
	*/
		System.out.println(studentsMapper);
	}
}
