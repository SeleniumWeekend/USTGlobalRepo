package com.java1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Teat2 
{	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pritam\\workspace\\JenkinsGitProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gitshalinikumari@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("shantnu@9590");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			
		}
	
}


