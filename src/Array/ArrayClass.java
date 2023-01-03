package Array;
import java.util.*;
public class ArrayClass {
	public static int Search(int [] array,int n) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==n)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int [] arr= {8,4,2,7,-2}; 
		int num=Sc.nextInt();
		System.out.println(Search(arr,num));
	}
}
 