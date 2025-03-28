package Sorting;

public class SelectionSort {
	
	public static int[] selectionSort(int[] arr) {
		
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			int minIdx = i;
			
			for(int j = i+1; j < n; j++) {
				if(arr[j] < arr[minIdx])
					minIdx = j;
			}
			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
		}
		return arr;
	}
	
	public static void main(String[]args) {
		
		int[] arr = {64,25,12,22,11};
		arr = selectionSort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
