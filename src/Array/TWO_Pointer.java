package Array;
import java.util.*;

public class TWO_Pointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1234567
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=Sc.nextInt();
		}
		Sc.close();
		int left=0;
		int right=n-1;
		while(left<right) {
			if(arr[left]%2!=0 && arr[right]%2==0) {
				Swap(arr,left,right);
				left++;
				right--;
			}
			else if(arr[left]%2==0)
				left++;
			else if(arr[right]%2==0)
				right--;
		}
		Display(arr);
		
		

	}
	public static void Swap(int [] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void Display(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	

}
