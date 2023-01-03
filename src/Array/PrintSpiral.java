package Array;

public class PrintSpiral {

	public static void main(String[] args) {
		
		
	}
		// TODO Auto-generated method stub
		public static void Printspiral(int [][] arr) {
			int minr=0;
			int minc=0;
			int maxr=arr.length-1;
			int maxc=arr[0].length-1;
			int te=maxr*maxc;
			int count=0;
			while(count<te)
			for(int i=minc;i<=maxc && count<te;i++) {
				System.out.print(arr[minr][i]+" ");
				count++;
			}
			minr++;
			for(int i=minr;i<=maxr && count<te;i++) {
				System.out.println(arr[i][maxc]+" ");
				count++;
			}
			maxc--;
			for(int i=maxc;i>=minc && count<te;i--) {
				System.out.println(arr[maxr][i]+" ");
				count++;
			}
			maxr--;
			for(int i=maxr;i>=minc && count<te;i--) {
				System.out.println(arr[i][minc]+" ");
				count++;
			}
			minc++;
			
			
		}

	}

