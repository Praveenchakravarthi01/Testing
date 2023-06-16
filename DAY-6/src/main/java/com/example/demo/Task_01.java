package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_01 {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String url = "https://demo.opencart.com/index.php?route=account/register&language=en-gb";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Aparna");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("M K");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("apar123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Aparnask@143");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,8000)", "");
		driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
