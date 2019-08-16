package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uer\\eclipse-workspace---Karthi\\GIT\\Drivvvve\\chromedriver.exe");
		WebDriver  d=new ChromeDriver();
		d.get("https://www.snapdeal.com");
		d.manage().window().maximize();
		WebElement r = d.findElement(By.id("inputValEnter"));
		r.sendKeys("iphone 6");
		WebElement u = d.findElement(By.xpath("//span[@class='searchTextSpan']"));
		u.click();
		WebElement e = d.findElement(By.xpath("//p[text()='Apple iPhone 6s ( 32GB , 2 GB ) Rose Gold']"));
		e.click();
		String w = d.getWindowHandle();
		Set<String> p = d.getWindowHandles();
		System.out.println(w +"/n"+ p);
		for(String x:p) {
			if(!x.equals(w)) {
				d.switchTo().window(x);
			}
		}
		WebElement i = d.findElement(By.xpath("//span[text()='add to cart']"));
		i.click();
	}
	
	

}
