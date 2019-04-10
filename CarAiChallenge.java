import java.util.Scanner;
/**
 *
 * @author Qurrat-al-Ain Siddiqui
 */

public class CarAiChallenge
{ 
    public void run()
    {
        Scanner in = new Scanner(System.in);

        // Variables and Constants

        int numAdult;
        int numChild;
        int crossAdult;
        int crossChild;

        final int ADULT_WORTH = 100;
        final int CHILD_WORTH = 145;
        final int TOUGH_CALL = 10;

        int passengerPoint;
        int pedestrianPoint;
        int callPoint;

        String userAns = "";

        // Get inputs

        System.out.println("Enter the number of adults in the car: ");
        numAdult = in.nextInt();

        System.out.println("Enter the number of children in the car: ");
        numChild = in.nextInt();

        System.out.println("Enter the number of adults on the crosswalk: ");
        crossAdult = in.nextInt();

        System.out.println("Enter the number of children on the crosswalk: ");
        crossChild = in.nextInt();

        // Calculations

        passengerPoint = (numAdult * ADULT_WORTH) + (numChild * CHILD_WORTH);

        pedestrianPoint = (crossAdult * ADULT_WORTH) + (crossChild * CHILD_WORTH);

        callPoint = passengerPoint - pedestrianPoint;

        // If statements

        if (passengerPoint > pedestrianPoint){
            System.out.println("The Fatality Report: ");
            System.out.println("The group killed is: PEDESTRIANS");
            System.out.println("Number of adults killed: " + crossAdult);
            System.out.println("Number of children killed: " + crossChild);
        }else{ 
            System.out.println("The Fatality Report: ");
            System.out.println("The group killed is: OCCUPANTS");
            System.out.println("Number of adults killed: " + numAdult);
            System.out.println("Number of children killed: " + numChild);
        }if (callPoint <= TOUGH_CALL){
            System.out.println("Are the lives of the occupants more valuable than the lives of the pedestrians?");
            userAns = in.next().toUpperCase();
        }if (userAns.equals("Y")){
            System.out.println("The Fatality Report: ");
            System.out.println("The group killed is: PEDESTRIANS");
            System.out.println("Number of adults killed: " + crossAdult);
            System.out.println("Number of children killed: " + crossChild);
        }else{
            System.out.println("The Fatality Report: ");
            System.out.println("The group killed is: OCCUPANTS");
            System.out.println("Number of adults killed: " + numAdult);
            System.out.println("Number of children killed: " + numChild);

        }
    }
}
