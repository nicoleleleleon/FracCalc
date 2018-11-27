package fracCalc;
import java.util.*;

public class FracCalc {

    public static void main(String[] args) 
    {
    	//parts("2");
    	//names(parts("3_1/2"));
        // TODO: Read the input from the user and call produceAnswer with an equation
    	System.out.println("What is the equation you'd like me to compute?");
    	Scanner userInput = new Scanner(System.in);
    	String input = userInput.nextLine(); //gets equation
    	while (!input.equals("quit")) {
			System.out.println(produceAnswer(input));  //puts into method
			System.out.println("Do you want to keep going? Type \"quit\" to end.");
			input = userInput.nextLine();
	
    	}
			
		
		
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
   //    String array = Arrays.toString(input.split(" "));
   //    System.out.println(array);
       String[] equat = input.split(" ");
       String operand1 = equat[0];
       String operator = equat[1];
       String operand2 = equat[2];
//       int num1 = Integer.parseInt(operand1);
 //      int num2 = Integer.parseInt(operand2);
      int[] num1 = intArray(array(parts(operand1)));
      int[] num2 = intArray(array(parts(operand2)));
      //doMath(num1,num2,operator);
        return names(array(parts(operand2)));
    }
	    
   public static String[] parts(String input) {//split into array without "/" and "_"
    	if(input.indexOf("_")>0 && input.indexOf("/")>0) {
    		String[] splitChars = input.split("_|\\/"); //splits _ and / ,, "|" makes it not split "_/" ,, "\\" separates them?
   		//System.out.println(Arrays.toString(splitChars));
    	return splitChars;
    	}else if (input.indexOf("_")<0 && input.indexOf("/")>0) {
    		String[] splitUnder = input.split("/");
    	//	System.out.println(Arrays.toString(splitUnder));
    		return splitUnder;
    	}else if (input.indexOf("_")<0 && input.indexOf("/")<0){
    		String[] noSplit = {input};
    	//	System.out.println(Arrays.toString(noSplit));
    		return noSplit;
    	}else {
    	String[] test = {"I","can't","code"};
    	return test;
   }
    // TODO: Fill in the space below with any helper methods that you think you will need
}
   public static String[] array(String[] parts) {//turn array into format whole, num, denom
	  String[] array = new String[3];
	   if(parts.length==2) {
		  array[0] = "0";
		  array[1]=parts[0];
		  array[2] = parts[1];
	   }else if (parts.length==1) {
		   array[0] = parts[0];
		   array[1] = "0";
		   array[2] = "1";
	   }else if (parts.length==3) {
		   for(int i=0; i<parts.length; i++) {
			   array[i]=parts[i];
		   }
	   }
	   return array;
   }
		      
   public static String names(String[] array) {//print out labels of the wholes, nums, denoms
	   String name = "whole:" + array[0] + " numerator:" + array[1] + " denominator:" + array[2];
	   return name;
   }
   public static int[] intArray(String[] array) {//turn String array into int array
	   int[] intArray = new int[3];
	   for(int i=0;i<array.length;i++) {
		   intArray[i]=Integer.parseInt(array[i]);
	   }
	   return intArray;
   }
   public static String doMath(int[] num1, int[] num2, String operand) {
   
}


}