package week1.day4;

public class BasePage {
 
	public void findElement() {
		System.out.println("FindElement");
	}
	
    public void clickElement() {
    	System.out.println("ClickElement");
	}
    
    public void enterText() {
    	System.out.println("EnterText");
   	}
	
    public void performCommonTasks() {
    	System.out.println("performCommonTasks");
   	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasePage base = new BasePage();
		base.clickElement();
		base.findElement();

	}

}
