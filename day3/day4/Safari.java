package week1.day4;

public class Safari extends Edge{

	public void readerMode() {
		System.out.println("reader mode");
	}
	
	public void fullScreenMode() {
		System.out.println("fullScreen mode");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Safari s = new Safari();
		s.takeSnap();
		s.clearCookies();
		s.openIncognito();
	}

}
