import java.util.Scanner;

public class UserInput {
  // This method takes a Scanner object as input and returns an array of two double values.
  public double[] getTwoNumbers(Scanner sc) {
    // Declaring an array of size 2 to store the two numbers.
    double[] numbers = new double[2];

    // Loop to take two inputs from the user.
    for (int i = 0; i < 2; i++) {
      // Prompting the user to enter a number.
      System.out.print("Enter number " + (i + 1) + ": ");
      // Reading the input and storing it in the array.
      numbers[i] = sc.nextDouble();
    }

    // Returning the array of numbers.
    return numbers;
  }

  // This method takes a Scanner object and the size of an array as inputs, and returns an array of double values.
  public double[] getArray(Scanner sc, int size) {
    // Declaring an array of the specified size.
    double[] array = new double[size];

    // Loop to take inputs from the user and store them in the array.
    for (int i = 0; i < size; i++) {
      // Prompting the user to enter an element.
      System.out.print("Enter element " + (i + 1) + ": ");
      // Reading the input and storing it in the array.
      array[i] = sc.nextDouble();
    }

    // Returning the filled array.
    return array;
  }
}
