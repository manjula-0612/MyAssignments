package week1.day4;

import java.util.Scanner;

import com.aventstack.extentreports.model.Test;

public class TestData {
 
	public void  enterCredentials() {
		
		System.out.println("Entered the Credentials successfully");
		
	}
	
	public void  navigateToHomePage() {
		System.out.println("Navigated to homepage");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestData data = new TestData();
		data.enterCredentials();
		data.navigateToHomePage();

	}

}
