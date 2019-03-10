package com.EdmodoTeacher.test;

import java.io.IOException;

//import java.io.File;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.EdmodoTeacher.pages.EdmodoTecherPage;
import com.EdmodoTeacher.testbase.SetUp;

public class EdmodoTeacherPageTest extends SetUp {
	EdmodoTecherPage tc1;
	@BeforeMethod
	public void open()
	{
		openBrowser();
		tc1=PageFactory.initElements(driver, EdmodoTecherPage.class);
	}
	@Test
	public void login() throws IOException
	{
		tc1.tlogin("vk.emp@kvk.in", "123456");
		screenShot("D:\\Testing Tools\\Framework\\EDMODO\\EdmodoTeacher\\Screenshot\\teacherLogin.png");
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
