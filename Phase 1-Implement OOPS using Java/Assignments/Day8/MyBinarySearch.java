package mypack;

public class MyBinarySearch {

	public int binarySearch(int[] a,int x) {
		
		MyBubbleSort b = new MyBubbleSort();
		int[] arr = b.bubbleSort(a);
		
		int  beg = 0;
		int last = arr.length -1;
		int mid = 0;
		while(beg<=last) {
			
			mid = (beg + last)/2;
			if(arr[mid]<x)
				beg = mid +1;
			else if (arr[mid]>x)
				last = mid -1;
			else return mid;
			
			
		}
		return -1;
		
		
	}
}
