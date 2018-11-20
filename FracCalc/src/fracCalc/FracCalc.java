package fracCalc;
import java.util.*;

public class FracCalc {

    public static void main(String[] args) 
    {
    	parts("3_1/2");
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
      
        return operand2;
    }
	    
   public static String parts(String input) {
    	if(input.indexOf("_")>0 && input.indexOf("/")>0) {
    		String[] splitUnderscore = input.split("_");
    		String[] splitSlash =  Arrays.toString(splitUnderscore).split("/");
   		System.out.println(Arrays.toString(splitSlash));
   		//does it know the elements? test--> at 0,1,2
    	return Arrays.toString(splitSlash);
    	}else { 
    		
    		return input;
   
   }
    // TODO: Fill in the space below with any helper methods that you think you will need
}

}
