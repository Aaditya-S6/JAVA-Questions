package Array;

public class Range_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,3,5,6,1,12,134,4,5,1,3};
		Reverse(arr,2,7);
	}
	public static void ReversalAlgo(int [] arr) {
		int n=arr.length;
		//last k element
		//first k element n-k
		Reverse(arr,0,n-k-1);
		Reverse(arr,0,n-k);
	}
	
	public static void Reverse(int [] array,int i,int j) {
		while(i<j) {
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			i++;
			j--;
			}
			
		}
		
		
	}

}
