package Easy;

public class SecondLargestNumber {
	
	public static void main(String[]args) {
		int arr[] = {12, 331, 123, 11, 5};
		int largest = 0, secondLargest = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if(arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		System.out.println(secondLargest);
	}

}
