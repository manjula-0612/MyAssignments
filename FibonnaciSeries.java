package week1.day1;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=8;
    int a=0;
    int b=1;
    for( int i=1;i<=num;i++)
    {
    	System.out.println(a+"");
    	int sum=a+b;
    	a=b;
    	b=sum;
    }
    
	}

}
