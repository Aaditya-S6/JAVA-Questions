package Array;

public class Max_value {

	
	public static int maxEle(int [] array) {
	int max=0;
	for(int i=0;i<array.length;i++) {
		if(array[i]>max)
			max=array[i];
	}
	return max;
}
	public static void main(String[] args) {
		int [] arr= {2,3,4,7,6,1,9,8};
		System.out.print(maxEle(arr));
	}
}
