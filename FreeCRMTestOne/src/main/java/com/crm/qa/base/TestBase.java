package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver Driver;
	public static Properties prop;
	
	public TestBase() {
		try {
		    prop=new Properties();
		    FileInputStream ip=new FileInputStream("C:\\chromedriver\\Git\\config.properties");
		    prop.load(ip);
		    
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
			
	}
	
	public static void initialization()throws Exception {
		
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			Driver=new ChromeDriver();
		}else if(browserName.equals("FF")) {
			System.setProperty("webdriver.firefox.driver", "C:\\geckodriver\\geckodriver.exe");
			Driver=new FirefoxDriver();
		}
	
		//ChromeOptions chromeOptions = new ChromeOptions();
            //chromeOptions.addArguments("--headless");
		//chromeOptions.setHeadless(true);
        
		    //Driver=new ChromeDriver(chromeOptions);
		    //ChromeOptions options = new ChromeOptions();
            //options.setHeadless(true);
            //opt.addArguments("--headless=new");
            //System.setProperty("webdriver.chrome.driver", "./YounitedAa/src/main/java/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        //Driver = new ChromeDriver(chromeOptions);
		
		Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		Thread.sleep(2000);
		Driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
		
		
	}

}
