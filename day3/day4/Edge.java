package week1.day4;

public class Edge extends Chrome {

	public void takeSnap() {
		System.out.println("multilevel Inheritance");
	}
	
	public void clearCookies() {
		System.out.println("Cookies is cleared");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Edge e = new Edge();
		e.closeBrowser();
		e.openIncognito();
		e.clearCache();
		e.takeSnap();
		

	}

}
