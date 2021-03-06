import java.util.Scanner;
import java.util.ArrayList;

public class App {
    //The main function in App.java has not been edited, according to the assignment's instructions.

    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);
    }

    //There are loops in case the user inputs a non-positive number for both height and weight.
    public static double getUserHeight() {
        Scanner Input = new Scanner(System.in);
        System.out.print("What is your height in inches?: ");
        double InputH = Input.nextDouble();

        while(InputH <= 0) {
            System.out.print("Please input a height greater than 0 to proceed.: ");
            InputH = Input.nextDouble();
        }
        return InputH;
    }

    public static double getUserWeight() {
        Scanner Input = new Scanner(System.in);
        System.out.print("What is your weight in pounds?: ");
        double InputW = Input.nextDouble();

        while(InputW <= 0) {
            System.out.print("Please input a weight greater than 0 to proceed.: ");
            InputW = Input.nextDouble();
        }
        return InputW;
    }

    //moreInput is used to begin a new BMI calculation. This starts when the program is run and after each BMI is registered
    //into the ArrayList.
    public static boolean moreInput() {
        char decision;
        Scanner Input = new Scanner(System.in);
        System.out.print("Would you like to add a user's BMI?: Y/N \n");
        decision = Input.next().charAt(0);
        while(decision !='y' && decision != 'n') {
            System.out.print("Would you like to add a user's BMI?: Y/N \n");
            decision = Input.next().charAt(0);
        }

        return decision == 'y' || decision == 'Y';
    }

    //This displays the user's BMI and what category it will fall under.
    public static void displayBmiInfo(BodyMassIndex bmi) {

        System.out.print("Your BMI is: " + String.format("%.2f", BodyMassIndex.bmi));
        System.out.print("\nYour BMI is in the category of: " + BodyMassIndex.BMICategory + '\n');
    }

    //At the end of the program, when moreInput is deemed false, this method measures the average of all user inputs.
    public static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) {
        int counter = 0;
        int entryAmount = bmiData.size();
        double averageBMI = BodyMassIndex.totalBMI / entryAmount;

        System.out.print("\nThe average BMI among all entries is: " + String.format("%.2f", averageBMI));
    }
}

