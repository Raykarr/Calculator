public class Calculator {

  // method to perform addition of two numbers
  public double performAddition(double[] numbers) {
    // returns the sum of the two numbers
    return numbers[0] + numbers[1];
  }
  
  // method to perform subtraction of two numbers
  public double performSubtraction(double[] numbers) {
    // returns the difference of the two numbers
    return numbers[0] - numbers[1];
  }
  
  // method to perform multiplication of two numbers
  public double performMultiplication(double[] numbers) {
    // returns the product of the two numbers
    return numbers[0] * numbers[1];
  }
  
  // method to perform division of two numbers
  public double performDivision(double[] numbers) {
    // returns the result of division of the two numbers
    return numbers[0] / numbers[1];
  }

  // method to calculate sum of all elements in an array
  public double sumArray(double[] array) {
    // variable to store sum
    double sum = 0;
    // loop to add each element of array to sum
    for (double num : array) {
      sum += num;
    }
    // return the sum of all elements in array
    return sum;
  }

  // method to calculate variance of elements in an array
  public double varianceArray(double[] array) {
    // calculate mean of elements in array
    double mean = sumArray(array) / array.length;
    // variable to store variance
    double variance = 0;
    // loop to calculate variance
    for (double num : array) {
      variance += Math.pow(num - mean, 2);
    }
    // return the variance of elements in array
    return variance / array.length;
  }

  // method to calculate standard deviation of elements in an array
  public double standardDeviationArray(double[] array) {
    // calculate variance of elements in array
    double variance = varianceArray(array);
    // return the standard deviation using the variance
    return Math.sqrt(variance);
  }
}
