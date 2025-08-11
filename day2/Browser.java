package week2.day2;

public class Browser {

	public String launchBrowser(String browserName) {
		System.out.println("Browser lanuched successfully"+" "+browserName);
		return browserName;
	}
	
	public void loadUr() {
		System.out.println("Application url loaded sucessfully");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser br=new Browser();
	    br.launchBrowser("Chrome");
	    br.loadUr();	
	}

}
