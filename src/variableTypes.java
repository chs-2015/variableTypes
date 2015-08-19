/**
 * Author: Brandon B.
 * Date: 8-19-15
 */
 
public class variableTypes {
    
    public static void main(String[] args) {
    	// There are three variable types that we will use in this class:
    	// String - Used to store things in quotes
    	// int - Used to store integers (whole numbers and their opposites)
    	// double - Used to store "floating point" numbers

		String s = "Hello World"; // Declaring and initalizing
		System.out.println(s);

		int age, day, month, year; // Declaring
		age = 15; // Initializing
		day = 19;
		month = 8;
		year = 2015;

		System.out.println(age + day + month + year);
		System.out.println(age);
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);

		double dog1;
		dog1 = 12.09034773455263283939;
		System.out.println(dog1);
		
		double p = Math.pow(10, -16)*1.92;
		System.out.println(p);
		
		int z = 1_2_3;
		System.out.println(z);
    }
}
