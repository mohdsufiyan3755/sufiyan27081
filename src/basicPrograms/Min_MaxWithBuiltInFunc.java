package basicPrograms;

import java.util.Arrays;
import java.util.Collections;

public class Min_MaxWithBuiltInFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {73, 64, 89, 21, 4, 66};
		int max = Collections.max(Arrays.asList(arr));
		System.out.println("Maximum value in an Array is: "+max);
		
		int min = Collections.min(Arrays.asList(arr));
		System.out.println("Minimum value in an Array is: "+min);

	}

}
