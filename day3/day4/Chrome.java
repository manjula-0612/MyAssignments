package week1.day4;

public class Chrome extends Browser{

	public void openIncognito() {
		System.out.println("Incognito is opened");
	}
	
	public void clearCache() {
		System.out.println("Cache is cleared");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome chr = new Chrome();
		chr.openURL();
		chr.navigateBack();

	}

}
