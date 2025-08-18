package week1.day4;

public class APIClient {
  
	public void sendRequest(String endPoint) {
		System.out.println("The EndPoint is  "+endPoint);
	}
	
   public void sendRequest(String endPoint,String requestBody,boolean requestStatus) {
	   System.out.println("The ouput is  "+endPoint+" "+requestBody+" "+requestStatus);
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient api = new APIClient();
		api.sendRequest("10");
		api.sendRequest("12", "welcome", false);

	}

}
