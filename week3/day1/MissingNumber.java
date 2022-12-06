package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		int[] value = {8,2,6,4,9,3,7,1,6,3,10};
		
		Set<Integer> num = new LinkedHashSet<Integer>();
		
		for (int i = 0; i < value.length; i++) {
			num.add(value[i]);
			
		}
		System.out.println("Array after duplication Removal: "+num);
		List<Integer> list1 = new ArrayList<Integer>(num);
		Collections.sort(list1);
		
		System.out.println("Sorted Array: "+list1);
		int temp=1;
		for (int i = 0; i < list1.size(); i++) {
			if(list1.get(i)==temp) {
				temp++;
			}
			
		}
		System.out.println("Missing Number : "+temp);
	}

	
	}


