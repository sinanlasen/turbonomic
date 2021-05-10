package turbonomicInterviewQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class QuestionTwo {

	public static void main(String[] args) {
		
		int ary[] = {3,5,8,9,0,-1};
		equilibriumIndex(ary);

	}

	 public static void equilibriumIndex(int arr[]){
	       if(arr.length == 2) {
	    	   System.out.println("array the size of 2 does not contain eqPoint");
	       }
		 
		 
		 // lefstSum stores the sum of elements from left to right adding preview sum to new "i" in a location.
	        int leftSum[] = new int[arr.length];
	        leftSum[0] = 0;
	        Object valueOfEqPoint = null;
	        
	        // go thru the array from left to right, add totals of preview numbers to itself and store it.
	        for (int i = 1; i < arr.length; i++) {
	            leftSum[i] = leftSum[i - 1] + arr[i - 1];
	        }
	 
	        // `rightSum` stores the sum of elements from right to left 
	        int rightSum = 0;
	 
	        // list of Equilibrium points in array to store more than one if there is 
	        List<Integer> eqPoint = new ArrayList<>();
	 
	        // go thru the array from right to left
	        for (int i = arr.length - 1; i >= 0; i--) {
	           //compare totals from left to right to totals from right to left till eq point is found.
	            if (leftSum[i] == rightSum) {
	                eqPoint.add(i);
	               valueOfEqPoint = Array.get(arr, i);
	               System.out.println(valueOfEqPoint);
	            } 
	            
	            rightSum += arr[i];
	        }
	        		
	        System.out.println("Equilibrium point found at " + eqPoint + " which is " + valueOfEqPoint);
	    }
	
	
}
