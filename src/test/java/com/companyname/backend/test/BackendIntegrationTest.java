package com.companyname.backend.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.companyname.backend.facade.EmployeeFacade;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:/spring/application-config.xml" })
public class BackendIntegrationTest {

		@Autowired
		EmployeeFacade employeeFacade;
		
		@Test
		public void mainTest()
		{
			System.out.println(employeeFacade.getAllEmployees());
		}
}
