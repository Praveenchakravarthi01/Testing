package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_03 {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/paypal-integration-form/");
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("aparna@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("aparna12@");
		WebElement web = driver.findElement(By.name("multiple_choice_1641271687[]"));
		web.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)", "");
		Thread.sleep(2000);
		Thread.sleep(2000);
		if (web.isSelected())
			System.out.print("IS SELECTED");
		else
			System.out.print("NOT SELECTED");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-310\"]/form/div[2]/button")).click();

	}
}
