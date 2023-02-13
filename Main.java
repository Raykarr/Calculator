// Name: KAUSTUBH RAYKAR 
// PRN: 21070126048
// Batch: AIML A3

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Create a Scanner object to get input from the user
    Scanner sc = new Scanner(System.in);
    
    // Create an instance of the UserInput class to get input from the user
    UserInput userInput = new UserInput();

    // Ask the user to enter two numbers for basic operations
    System.out.println("Enter two numbers for basic operations: ");
    
    // Get the two numbers from the user and store them in an array
    double[] numbers = userInput.getTwoNumbers(sc);

    // Create an instance of the Calculator class to perform calculations
    Calculator calculator = new Calculator();
    
    // Call the performAddition() method to perform the addition operation on the two numbers
    double resultAdd = calculator.performAddition(numbers);
    
    // Call the performSubtraction() method to perform the subtraction operation on the two numbers
    double resultSubtract = calculator.performSubtraction(numbers);
    
    // Call the performMultiplication() method to perform the multiplication operation on the two numbers
    double resultMultiply = calculator.performMultiplication(numbers);
    
    // Call the performDivision() method to perform the division operation on the two numbers
    double resultDivide = calculator.performDivision(numbers);

    // Display the results of the basic operations
    System.out.println("Addition: " + resultAdd);
    System.out.println("Subtraction: " + resultSubtract);
    System.out.println("Multiplication: " + resultMultiply);
    System.out.println("Division: " + resultDivide);

    // Ask the user to enter the size of the array for complex operations
    System.out.println("Enter size of array: ");
    
    // Get the size of the array from the user
    int size = sc.nextInt();
    
    // Get the array from the user
    double[] array = userInput.getArray(sc, size);

    // Call the sumArray() method to get the sum of the elements in the array
    double sum = calculator.sumArray(array);
    
    // Call the varianceArray() method to get the variance of the elements in the array
    double variance = calculator.varianceArray(array);
    
    // Call the standardDeviationArray() method to get the standard deviation of the elements in the array
    double standardDeviation = calculator.standardDeviationArray(array);

    // Display the results of the complex operations
    System.out.println("Sum of array: " + sum);
    System.out.println("Variance of array: " + variance);
    System.out.println("Standard deviation of array: " + standardDeviation);
  }
}
