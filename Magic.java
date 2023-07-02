import java.util.Scanner;

public class Magic {
    public static void main(String[] args) {

        System.out.println();

        Scanner in = new Scanner(System.in);

        int myNumber = in.nextInt();
        // myNumber is the Original Number
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;

        System.out.println();
        System.out.println("The Original Number is " + myNumber + ".");
        System.out.println();
        System.out.println("The Final Number is " + stepSix + ".");
        System.out.println();

        in.close();
    }
}