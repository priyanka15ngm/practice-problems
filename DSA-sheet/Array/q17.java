import java.util.*;

class Solution {
	public static void main(String[] args) {

		int[] arr1 = { 1, 4, 7, 8, 10 };

		int[] arr2 = { 2, 3, 9 };
		int n1 = 5;
		int n2 = 3;

		for (int i = 0; i < n1 - 1; i++) {
			for (int j = 0; j < n2; j++) {

				if (arr1[i] < arr2[j]) {
					int temp = arr1[i + 1];
					arr1[i + 1] = arr2[j];
					arr2[j] = temp;
					Arrays.sort(arr2);
					break;

				}
			}
		}
		// System.out.println(Arrays.toString(arr1));
		for (int m = 0; m < n1; m++) {
			System.out.print(arr1[m] + " ");
		}

		System.out.println();
		for (int m = 0; m < n2; m++) {
			System.out.print(arr2[m] + " ");
		}

	}
}
