import java.util.Scanner;

public class Daily_Water_Challenge {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double recommendedWaterIntake = 8;
        double daysInChallenge = 30;

        double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;

        System.out.println();
        System.out.println("The Total Recommended Amount is " + totalRecommendedAmount + " gallons.");
        System.out.println();

        double yourWaterIntake = in.nextDouble();
        System.out.println();
        boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;

        System.out.println("You have drunk " + yourWaterIntake + " gallons of water.");
        System.out.println();

        if (isChallengeComplete == true) {
            System.out.println("You have completed your challenge. You drank the Total Recommended Amount.");
            System.out.println();
        } else {
            System.out.println("You have not completed your challenge. You drank less than the Total Recommended Amount.");
            System.out.println();
            
            System.out.println("But don't worry, you can try again!");
            System.out.println();
        }
        
        in.close();
    }
}
