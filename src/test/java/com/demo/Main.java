package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	
	public static void main(String[] args) {
	
		
		int num=7;
		// num=num+2;
		num+=2;

		//num++;    //post increment
		//++num;    //pre increment
		//num--;    //post decrement
		--num;	  //pre decrement
		System.out.println(num); //8

		int result=--num;
		//result=num;//fetch the value and then increment
		System.out.println(result);

	
		//driver.quit();
		
		
	
	}

}
