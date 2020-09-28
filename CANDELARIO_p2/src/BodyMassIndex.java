public class BodyMassIndex {

    public static double bmi;
    public static String BMICategory;

    public BodyMassIndex(double height, double weight) {
        bmi = 703 * weight / (Math.pow(height,2));
        BodyMassCategory();
    }

    public static void BodyMassCategory() {
        int Category = 0;
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