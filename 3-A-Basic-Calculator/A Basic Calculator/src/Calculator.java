/*you will use classes, methods, and objects to create a simple arithmetic calculator. The calculator will be able to:

    Add two integers
    Subtract two integers
    Multiply two integers
    Divide two integers
    Apply the modulo operator on two integers
*/

public class Calculator{

    // Creating a Calculator constructor
    public Calculator(){

    }

    // Creating a public method that returns an int and call it add().
    public int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    // Creating a public method that returns the result and calling it subtract().
    public int subtract(int a, int b){
        int result = a - b;
        return result;
    }

    public int multiply(int a, int b){
        int product = a * b;
        return product;
    }

    public int divide(int a, int b){
        int remainder = a / b;
        return remainder;
    }

    public int modulo(int a, int b){
        int yaya = a % b;
        return yaya;
    }

    // The output should be 12 and 34
    public static void main(String[] args){
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));
    }
}