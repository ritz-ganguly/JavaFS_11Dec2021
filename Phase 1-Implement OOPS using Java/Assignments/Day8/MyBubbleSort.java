package mypack;

public class MyBubbleSort {
	public int[] bubbleSort(int[] arr) {
		for(int i =arr.length - 1;i>=1;i--) {
			for(int j = 0;j<i;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
			
		}
	return arr;	
	}
 
}
