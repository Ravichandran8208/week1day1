package week1day2;

import java.util.Arrays;

public class MissingElementInanarray {

	public static void main(String[] args) {
		int[] array = {1,3,4,2,6};
		int i =1;
		
		Arrays.sort(array);
		for( i=1;i<array.length;i++);{
			if(i!=array[i-1]) {
				System.out.println("the missing element is="+i);
				System.out.println(array.length);
				
				
			}
			
		}
		

	}

}
