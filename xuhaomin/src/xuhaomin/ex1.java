package xuhaomin;
import java.lang.*;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		print(n);

	}
	public static void print (int n) {
	    for (int i=1;i<=n;i++)
	    {
	    	for(int j=1;j<=i;j++) {
	    		System.out.print(i+"*"+j+"="+(j*i)+" ");
	    	}
	    	System.out.println("\r\n");
	    }
	}

}
