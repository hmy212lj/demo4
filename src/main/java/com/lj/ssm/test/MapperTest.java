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
 * ����dao��Ĺ���
 * 
 * @author liu
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	/**
	 * ����StudentMapper
	 */
	@Autowired
	StudentsMapper studentsMapper;
	@Test
	public void testCRUD() {
		
	/*	// 1c����springIoc����
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2�������л�ȡmapper
		TeacherMapper bean=ioc.getBean(TeacherMapper.class);
	*/
		System.out.println(studentsMapper);
	}
}
