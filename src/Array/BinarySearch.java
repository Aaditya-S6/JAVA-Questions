package Array;

public class BinarySearch {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		int item=4;
		System.out.println(Search(arr,item));

	}
	public static int Search(int [] arr,int item) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==item) {
				return mid;
			}
			else if(arr[mid]>item) {
				hi=mid-1;
				
			}
			else {
				lo=mid+1;
			}
			
		}
		return -1;
	}

}
