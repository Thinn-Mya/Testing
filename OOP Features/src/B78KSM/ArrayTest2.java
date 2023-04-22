package B78KSM;

import java.util.Arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		int [] array = {10,20,30,40,50 };
		int index=Arrays.binarySearch(array, 30);
		System.out.println("Found Index=" + index);
		System.out.println(Arrays.toString(array));
		/*
		 * int b[]=Arrays.copyOf(array, 6); 
		 * System.out.println(Arrays.toString(b));
		 * System.out.println(Arrays.equals(array, b)); 
		 * int c[]= new int [3];
		 * Arrays.fill(c, 3); 
		 * System.out.println(Arrays.toString(c)); 
		 * int [] d ={1,5,3}; Arrays.sort(d); 
		 * System.out.println(Arrays.toString(d));
		 */
		Arrays.fill(array,1,4,7);
		System.out.println(Arrays.toString(array));
		
	}

}
