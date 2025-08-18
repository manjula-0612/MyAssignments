package week1.day4;

public class Overloading {

	public void reportStep(String msg,String status) {
		System.out.println(msg +" is " +status);
	}
	
   public void reportStep(String msg,String status,boolean snap) {
	   System.out.println(msg +" is " +status + " " +snap);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Overloading over = new Overloading();
	over.reportStep("Status", "pass");
	over.reportStep("Status", "fail", false);
	
	}
}
