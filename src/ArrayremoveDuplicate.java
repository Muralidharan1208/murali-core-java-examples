import java.util.Arrays;

public class ArrayremoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 4, 7, 5, 8, 3, 2, 4, 1 };

		System.out.println("Berfore removal (Original) : ");

		Arrays.sort(arr);

		int length = arr.length;
		for (int i = 0; i < length; i++) {
			System.out.println(arr[i] + " ");
		}

		length = removeDuplicates(arr, length);

		System.out.println(" ");
		
		
		System.out.println("After removal (Result) : ");
		for (int i = 0; i < length; i++)
			System.out.println(arr[i] + " ");
	}

	public static int removeDuplicates(int arr[], int count) {

		if (count == 0 || count == 1) {
			return count;
		}
		
		int[] temp = new int [count];
		int j=0;
		
		for (int i=0; i<count-1; i++) {
			if (arr [i] != arr [i+1]) {
				temp [j++] = arr[i];
			}
		}
		
		//temp[j++] = arr[count-1];
		//for (int i=0; i<count-1; i++)
		//	arr[i] =temp[i];
		
		return j;

	}
	
	
}
