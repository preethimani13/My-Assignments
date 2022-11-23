package week1.day3;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		
		for (int i =arr[0]; i < arr.length; i++) {
			if(arr[i]!=i+1) {
				System.out.println("Missing Number is: "+(i+1));
				break;
			}
			
		}

	}

}
