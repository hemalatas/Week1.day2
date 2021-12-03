package week1.day2;

import java.util.Arrays;

public class MissingelementArray {


	public static void main(String[] args) {
		int[] array = {1,2,3,4,7,6,8};
		
		Arrays.sort(array);
		for(int i=1;i<array.length;i++) {
			if(i!=array[i-1]) {
				System.out.println("The missing element is" +i);
				break;
			}
		}
		
		
			

	}
}