package fracCalc;
import java.util.*;

public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	System.out.println("What is the equation you'd like me to compute?");
    	Scanner userInput = new Scanner(System.in);
    	boolean done = false;
    	String response = "";
    	String input = "";
    	while (!done) {
			input = userInput.next(); //gets equation
			//produceAnswer(input);  puts into method
			System.out.println(produceAnswer(input)); //prints answer
			System.out.println("Do you want to keep going? Type \"quit\" to end");
			response = userInput.next();//they'll type something
			if (response.equals("quit")) { //if it is "quit"...
				done = true;
				System.out.println("Have a nice day!");
			}else {
				System.out.println("Give me another equation!");
			}
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
       System.out.println(Arrays.toString(input.split(" ")));
        
        return "";
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
