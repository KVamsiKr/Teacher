package com.EdmodoTeacher.testbase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SetUp {
	public static WebDriver driver;
	public void openBrowser()
	{
		//System.setProperty("webdriver.gecko.driver", "D:\\Testing Tools\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://akuteegapadu.com/student/");
		
	}
	public void screenShot(String screen) throws IOException
	{
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(screen));
	}

}
