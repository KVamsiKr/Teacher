package com.EdmodoTeacher.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.EdmodoTeacher.testbase.SetUp;

public class EdmodoTecherPage extends SetUp {
	@FindBy(xpath="//*[text()='Teacher Login']")
	WebElement tLink;
	@FindBy(xpath="//input[@type='text']")
	WebElement uname;
	@FindBy(name="pwd")
	WebElement pass;
	@FindBy(xpath="//*[@class='iCheck-helper']")
	WebElement remind;
	@FindBy(name="submit")
	WebElement sub;
	public EdmodoTecherPage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean tlogin(String u,String p)
	{
		tLink.click();
		uname.sendKeys(u);
		pass.sendKeys(p);
		boolean x=remind.isSelected();
		remind.click();
		sub.click();
		return x;
	}
}
