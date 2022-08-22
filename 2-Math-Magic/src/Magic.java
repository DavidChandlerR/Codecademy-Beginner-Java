//  You will become a mathemagician and write a  small program that performs a mathematical magic trick!
//  It will involve performing arithmetic operations on an integer that you choose.


public class Magic {

    public static void main(String[] args) {

        // Create an int variable called myNumber.
        // Set it equal to any integer other than 0.
        int myNumber = 5;

        // Create an int variable called stepOne.
        //Set it equal to the original number (myNumber) multiplied by itself.
        int stepOne = myNumber * myNumber;

        //Set it equal to the previous result (stepOne) plus the original number (myNumber).
        int stepTwo = stepOne + myNumber;

        // Set it equal to the previous result (stepTwo) divided by the original number.
        int stepThree = stepTwo / myNumber;

        // Set it equal to the previous result (stepThree) plus 17.
        int stepFour = stepThree + 17;

        // Set it equal to the previous result (stepFour) minus the original number.
        int stepFive = stepFour - myNumber;

        // Set it equal to the previous result (stepFive) divided by 6
        int stepSix = stepFive / 6;

        System.out.println(stepSix);
        System.out.println("It's the same number!");
    }
}