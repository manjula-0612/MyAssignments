package week1.day5;

public class Concrete implements DatabseConnection{
	
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
		Concrete con = new Concrete();
		con.connect();
		con.disconnect();
		con.executeUpdate();

	}



}
