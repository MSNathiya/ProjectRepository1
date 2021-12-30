package com.SeleniumMiniproject;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MiniProject {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nathiya\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://automationpractice.com/index.php");
	
	WebElement TShirts =driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
	TShirts.click();

    WebElement img =driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
    Actions ac=new Actions(driver);
    ac.moveToElement(img).build().perform();
    Thread.sleep(2000);
    WebElement cartBtn =driver.findElement(By.xpath("//span[text()='Add to cart']"));
    cartBtn.click();
    Thread.sleep(2000);
    WebElement ProceedBtn1 =driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
    ProceedBtn1.click();
    Thread.sleep(2000);
    WebElement signProceedBtn  =driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
    signProceedBtn .click();
    Thread.sleep(2000);
    
    WebElement Email  =driver.findElement(By.id("email"));
    Email.sendKeys("nathiya96@gmail.com");
    Thread.sleep(2000);
    WebElement password =driver.findElement(By.name("passwd"));
    password.sendKeys("abc@123");
    Thread.sleep(2000);
    WebElement signIN =driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
    signIN.click();
    Thread.sleep(2000);
   
  
    WebElement AddrProceedBtn =driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
    AddrProceedBtn.click();
    Thread.sleep(2000);
    WebElement Agreebox =driver.findElement(By.name("cgv"));
    Agreebox.click();
    Thread.sleep(2000);
    WebElement ShipProceedBtn =driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
    ShipProceedBtn .click();
    Thread.sleep(2000);
    
    
    WebElement BankPay  =driver.findElement(By.xpath("//a[@class='cheque']"));
    BankPay.click();
    Thread.sleep(2000);
    WebElement ConfirmOrder =driver.findElement(By.xpath("//span[text()='I confirm my order']"));
    ConfirmOrder.click();
    Thread.sleep(2000);
    TakesScreenshot ts=(TakesScreenshot)driver;
	File Source=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\Nathiya\\eclipse-workspace\\Selenium\\Driver\\screenshots\\MiniProject.png");
	FileUtils.copyFile(Source,destination);
	Thread.sleep(2000);
	System.out.println("TakesScreenshot -MiniProject");
	}}   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//	Robot r=new Robot();
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
//	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
////	WebElement sumdress=driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
//	sumdress.click();
//	WebElement size=driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
//	size.click();
//	Thread.sleep(2000);
	
	
	
	
	
	
	
	


