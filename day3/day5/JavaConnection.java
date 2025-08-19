package week1.day5;

public class JavaConnection extends MySqlConnection {

	@Override
	public void connect() {
		System.out.println("connect");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate");
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();

	}


}
