package xuhaomin;
import java.lang.*;
public class sort{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,5,3,7,6};
		int n=arr.length;
		sort (arr,0,n-1);
		for(int i=0;i<n;i++) {
			
			System.out.print(arr[i]);
		}
		
	}
	public static void sort(int []arr,int low, int high) {
		int l =low;
		int h=high;
		int povit=arr[low]; 
		while(l<h){
			while(l<h&&arr[h]>=povit)
				h--;
			if(l<h){
				int temp=arr[h];
				arr[h]=arr[l];
				arr[l]=temp;
				l++;
			}
		 
			while(l<h&&arr[l]<=povit)
			l++;
			 
			if(l<h){
			int temp=arr[h];
			arr[h]=arr[l];
			arr[l]=temp;
			h--;
			}
		}
		
		
//		System.out.print("l="+(l+1)+"h="+(h+1)+"povit="+povit+"\n");
		if(l>low)
			sort(arr,low,l-1);
		if(h<high)
			sort(arr,l+1,high);
}
	
}