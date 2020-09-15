
public class Encrypter {
    public static String GrabbedInput = CANDELARIO_p1.SentInput;
    private static int NewDigit1, NewDigit2, NewDigit3, NewDigit4;
    public static String Output;

    //To get the encrypted sequence of numbers, I used functions to help calculate, swap numbers, and output the string according to the assignment.
    public void encrypt(String GrabbedInput) {
        Calculate();
        NumberSwap();
        OutputToString();
    }

    public static void Calculate() {
        int Digit1, Digit2, Digit3, Digit4;
        Digit1 = Character.digit(GrabbedInput.charAt(0), 10);
        Digit2 = Character.digit(GrabbedInput.charAt(1), 10);
        Digit3 = Character.digit(GrabbedInput.charAt(2), 10);
        Digit4 = Character.digit(GrabbedInput.charAt(3), 10);

        NewDigit1 = (Digit1 + 7) % 10;
        NewDigit2 = (Digit2 + 7) % 10;
        NewDigit3 = (Digit3 + 7) % 10;
        NewDigit4 = (Digit4 + 7) % 10;

    }

    public static void NumberSwap() {
        NewDigit1 = NewDigit1 + NewDigit3;
        NewDigit3 = NewDigit1 - NewDigit3;
        NewDigit1 = NewDigit1 - NewDigit3;

        NewDigit2 = NewDigit2 + NewDigit4;
        NewDigit4 = NewDigit2 - NewDigit4;
        NewDigit2 = NewDigit2 - NewDigit4;
    }

    public static String OutputToString() {
        Output = String.format("%d%d%d%d",NewDigit1, NewDigit2, NewDigit3, NewDigit4);
        return Output;
    }
}
