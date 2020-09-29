public class BodyMassIndex {

    public static double bmi = 0;
    public static String BMICategory;
    public static double totalBMI = 0;
    public static int Category = 0;

    //The first method is a simple calculation of BMI. After calculating, it is also added to a totalBMI variable.
    //This will be used to measure the average BMI of all user inputs.
    public BodyMassIndex(double height, double weight) {
        bmi = 703 * weight / (Math.pow(height,2));
        BodyMassCategory();
        totalBMI += bmi;
    }

    //This method is used to organize and label the user's BMI according to the designated categories.
    public static void BodyMassCategory() {
        if(bmi < 18.5) Category = 1;
        if(bmi >= 18.5 && bmi < 25) Category = 2;
        if(bmi >= 25 && bmi < 30) Category = 3;
        if(bmi >= 30) Category = 4;

        if(Category == 1) BMICategory = "Underweight";
        if(Category == 2) BMICategory = "Normal Weight";
        if(Category == 3) BMICategory = "Overweight";
        if(Category == 4) BMICategory = "Obese";
    }


}