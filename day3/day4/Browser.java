package week1.day4;

public class Browser {

	public void openURL(){
		System.out.println("Open the url:");
	}
	
	public void closeBrowser() {
		System.out.println("Close the browser");
	}
	
	public void navigateBack() {
		System.out.println("Go back to screen");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "Google Chrome";
		String browserVersion = "g12";
		
		Browser b = new Browser();
	    b.openURL();

	}

}
