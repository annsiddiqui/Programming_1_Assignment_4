import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Qurrat-al-Ain Siddiqui
 */
public class RpgpcGeneratorChallenge
{
    public void run()
    { 
        // Variables

        int rolls;
        int totalRolls;
        int roll1;
        int roll2;
        int roll3;
        int roll4;
        int dexterity;
        int modifier;
        int score = 0;
        int scoreM = 1;
        int scoreEH = 2;

        // Constants

        final int SCORE_0 = 0;
        final int SCORE_1 = 1;
        final int SCORE_2 = 2;
        final int SCORE_3 = 3;
        final int SCORE_4 = 4;
        final int SCORE_5 = 5;
        final int SCORE_6 = 6;
        final int SCORE_7 = 7;
        final int SCORE_8 = 8;
        final int SCORE_9 = 9;
        final int SCORE_10 = 10;
        final int SCORE_11 = 11;
        final int SCORE_13 = 13;
        final int SCORE_15 = 15;
        final int SCORE_17 = 17;
        final int SCORE_19 = 19;
        final int SCORE_21 = 21;
        final int SCORE_23 = 23;
        final int SCORE_25 = 25;
        final int SCORE_27 = 27;
        final int SCORE_29 = 29;

        String race = "";

        Scanner keyboard = new Scanner(System.in);

        // Get user to enter 4 rolls

        System.out.println("Please enter your 4 rolls: ");
        roll1 = keyboard.nextInt();
        roll2 = keyboard.nextInt();
        roll3 = keyboard.nextInt();
        roll4 = keyboard.nextInt();

        // Calculations

        rolls = Math.min(roll1, Math.min(roll2, Math.min(roll3, roll4)));

        totalRolls = (roll1 + roll2 + roll3 + roll4) - rolls;

        // Ask user for race

        System.out.println("Please choose your race: ");
        race = keyboard.next().toUpperCase();

        if (race.equals ("M")){
            score = totalRolls + scoreM;
        }else if (race.equals ("D")){
            score = totalRolls;
        }else if (race.equals ("E")){
            score = totalRolls + scoreEH;
        }else if (race.equals ("H")){
            score = totalRolls + scoreEH;
        }    

        // More if statements - score

        if (score ==1){
            modifier = -SCORE_5;
        }else if (score <= SCORE_3){
            modifier = -SCORE_4;
        }else if (score <= SCORE_5){
            modifier = -SCORE_3;
        } else if (score <= SCORE_7){
            modifier = -SCORE_2;
        }else if (score <= SCORE_9){
            modifier = -SCORE_1;
        }else if (score <= SCORE_11){
            modifier = +SCORE_0;
        }else if (score <= SCORE_13){
            modifier = +SCORE_1;
        }else if (score <= SCORE_15){
            modifier = +SCORE_2;
        }else if (score <= SCORE_17){
            modifier = +SCORE_3;
        }else if (score <= SCORE_19){
            modifier = +SCORE_4;
        }else if (score <= SCORE_21){
            modifier = +SCORE_5;
        }else if (score <= SCORE_23){
            modifier = +SCORE_6;
        }else if (score <= SCORE_25){
            modifier = +SCORE_7;
        }else if (score <= SCORE_27){
            modifier = +SCORE_8;
        }else if (score <= SCORE_29){
            modifier = +SCORE_9;
        }else{
            modifier = +SCORE_10;
        }

        // Print outputs (race, dexterity, modifier and applied modifier - if statements

        if (race.equals("M")){
            System.out.println("Race: HUMAN");
            dexterity = totalRolls + 1;
            System.out.println("Dexterity: " + dexterity + "*");
            System.out.print("Modifier: ");
            System.out.format("%+d" , modifier);
            System.out.println();
            System.out.println("Note: applied racial modifier (+1)");
        }else if (race.equals("D")){
            System.out.println("Race: DWARF");
            dexterity = totalRolls;
            System.out.println("Dexterity: " + dexterity);
            System.out.print("Modifier: ");
            System.out.format("%+d" , modifier);
            System.out.println();
            System.out.println("");
        }else if (race.equals("E")){
            System.out.println("Race: ELF");
            dexterity = totalRolls + 2;
            System.out.println("Dexterity: " + dexterity + "*");
            System.out.print("Modifier: ");
            System.out.format("%+d" , modifier);
            System.out.println();
            System.out.println("Note: applied racial modifier (+2)"); 
        }else if (race.equals("H")){
            System.out.println("Race: HALFLING");
            dexterity = totalRolls + 2;
            System.out.println("Dexterity: " + dexterity + "*");
            System.out.print("Modifier: ");
            System.out.format("%+d" , modifier);
            System.out.println();
            System.out.println("Note: applied racial modifier (+2)");
        }
    }
}