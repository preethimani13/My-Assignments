package week1.day3;


public class FindIntersection {

	public static void main(String[] args) {
		int array1[]={3,2,11,4,6,7};
		int array2[]={1,2,8,4,9,7};
		int length = array1.length;
		int length2=array2.length;
		System.out.println("Similar No's found in 2 arrays are: ");
		for (int i=0;i<length;i++) {
			for (int j = 0; j < length2; j++) {
				if(array1[i]==array2[j]) {
					System.out.println(array1[i]);
				}	
			}
			
		}
				
	}

	}


