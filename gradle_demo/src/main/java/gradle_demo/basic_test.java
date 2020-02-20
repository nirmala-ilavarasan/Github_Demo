package gradle_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_test {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:/Users/BLTuser.BLT1211/Downloads/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://jqueryui.com/draggable/");
    driver.manage().window().maximize(); 
    driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
    System.out.println(driver.findElement(By.xpath("//*[@id=\"draggable\"]")));
    driver.switchTo().defaultContent();
    driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click(); 
    	
	
	
	
	}	
	
	
	

}
