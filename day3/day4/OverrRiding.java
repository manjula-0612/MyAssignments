package week1.day4;

public class OverrRiding extends Overloading{

	
    @Override
    public void reportStep(String msg, String status, boolean snap) {
    	// TODO Auto-generated method stub
    	System.out.println(msg+status+snap);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrRiding over1 = new OverrRiding();
		over1.reportStep("Status", "pass", false);
	}

}
