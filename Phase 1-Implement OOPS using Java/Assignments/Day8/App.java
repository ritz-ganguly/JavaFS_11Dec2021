package mypack;

public class App {

	public static void main(String[] args) {
		MyBubbleSort b = new MyBubbleSort();
		int[] arr = new int[] {55,44,33,22,11};
		int[] temp = b.bubbleSort(arr);
		System.out.println("The sorted array is ");
		for(int i=0;i<temp.length;i++)
			System.out.println(temp[i]);
		
		
		
		MyBinarySearch s = new MyBinarySearch();
		int idx = s.binarySearch(arr, 77);
		
		System.out.println("element found at index "+idx);
		
		

	}

}
