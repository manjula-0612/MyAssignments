package week1.day4;

import java.util.Scanner;

public class LoginTestData extends TestData{

	public void  enterUsername() {
		System.out.println("Enter the usernamme:");
		Scanner sc = new Scanner(System.in);
		String username =sc.next("manju");
		
	}
	

	public void  enterPassword() {
		System.out.println("Enter the password:");
		Scanner sc = new Scanner(System.in);
		String password =sc.next("123");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData login = new LoginTestData();
		login.enterUsername();
		login.enterPassword();
		login.enterCredentials();
		login.navigateToHomePage();

	}

}
