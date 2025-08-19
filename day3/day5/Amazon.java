package week1.day5;

public class Amazon extends CanaraBank{
	@Override
	public void cashOnDelivery() {
		System.out.println("CashondeLivery");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upiPayments() {
		System.out.println("upi");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cardPayments() {
		System.out.println("cardpayments");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void internetBanking() {
		System.out.println("internet");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("recordPayment");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Amazon am = new Amazon();
		am.cashOnDelivery();
		am.upiPayments();
		am.cardPayments();
		am.internetBanking();
		am.recordPaymentDetails();
	}

	

}
