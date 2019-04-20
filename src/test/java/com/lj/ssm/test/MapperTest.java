package com.lj.ssm.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lj.ssm.dao.StudentsMapper;

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
	//@Autowired
	//StudentsMapper studentsMapper;

	@Test
	public void testCRUD() {
		
	//	System.out.println(studentsMapper);
	}
}
