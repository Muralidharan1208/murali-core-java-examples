package javaarray;

//Removing/deleting the duplicate values in an array.
public class PracticeArray9 {
	public static int[] removeDuplicates(int arr[], int count) {
		if (count == 0 || count == 1) {
			return arr;
		}
		// creating a temporary array to hold non-duplicate elements
		int[] temp = new int[count];
		int j = 0;
		for (int i = 0; i < count - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				// temp[j++] = arr[i];
				temp[j] = arr[i];
				j = j + 1;
			}
		}
		temp[j++] = arr[count - 1];
		// copying the temp array to the original array

		int[] y = new int[j];

		for (int x = 0; x < j; x++) {
			y[x] = temp[x];
		}
		return y;
	}

	public static void main(String[] args) {
		 int arr[] = { 1, 2, 2, 3, 4, 5, 5, 5 };
		//int arr[] = {};
		System.out.print("Original Array: ");
		int length = arr.length;
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");

		// getting the new array size after removing duplicates
		arr = removeDuplicates(arr, length);

		// for new line
		System.out.println("");

		// Displaying array with non-duplicate elements
		System.out.print("Array after removing duplicate elements: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}