package xuhaomin;

public class ex2 {
	public static void print (int n) {
		for (int i=0;i<=n;i++) {
			for(int j=n;j>0;j--) {
				if(j>i) {
					System.out.print(" "+" ");
				}
				else {
					System.out.print("*"+" ");
				}
				
			}
			for(int j=0;j<=n;j++) {
				if(j>i) {
					System.out.print(" "+" ");
				}
				else {
					System.out.print("*"+" ");
				}
				
			}
		System.out.println("");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		print(n);

	}

}
