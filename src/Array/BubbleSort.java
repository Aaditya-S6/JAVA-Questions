package Array;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {9,1,2,3,0};
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
}
}