package Array;

public class ReverseArray {

	public static void main(String[] args) {
		int [] arr= {1,3,1,3,2,4,422,-99,800};
		Reverse(arr);

	}
	public static void Reverse(int [] array) {
		int len=array.length;
		for(int i=0;i<len/2;i++) {
			int temp=array[i];
			array[i]=array[len-i-1];
			array[len-i-1]=temp;
		}

		for(int j=0;j<len;j++) {
			System.out.print(array[j]+",");
		}
		
	}

}
