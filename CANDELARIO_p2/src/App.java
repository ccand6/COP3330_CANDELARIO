import java.util.Scanner;

public class App {

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
        System.out.print("What is your height in inches?: ");
        double InputW = Input.nextDouble();

        while(InputW <= 0) {
            System.out.print("Please input a height greater than 0 to proceed.: ");
            InputW = Input.nextDouble();
        }
        return InputW;
    }

    public static void displayBmiInfo() {
        System.out.print("Your BMI is:" + bmi);
    }
}

