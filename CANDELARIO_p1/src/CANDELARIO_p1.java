import java.util.Scanner;

public class CANDELARIO_p1 {
    public static int InputNumber;
    public static String SentInput;

    Encrypter encrypt = new Encrypter();
    Decrypter decrypt = new Decrypter();

    public static void main(String[] args) {

        GetNumber();
        Choice();
    }

    //This is the beginning of the program, where we receive a 4-digit input. A '0' is padded for each digit that is missing.
    public static void GetNumber() {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a 4 digit number to proceed:");
        InputNumber = Input.nextInt();
        SentInput = String.format("%d",InputNumber);

        while(InputNumber > 9999) {
            System.out.print("Enter a 4 digit number to proceed:");
            InputNumber = Input.nextInt();
            SentInput = String.format("%d",InputNumber);
        }

        if(InputNumber <= 999) {
            SentInput = String.format("%04d",InputNumber);
        }
    }

    //This is where the user inputs a number to decide whether to encrypt or decrypt the given number.
    public static void Choice() {
        Scanner Input2 = new Scanner(System.in);
        System.out.print("Enter 1 to encrypt or 2 to decrypt this Number:");
        int Number = Input2.nextInt();

        while (Number != 1 && Number != 2) {
            System.out.print("Enter 1 to encrypt or 2 to decrypt this Number:");
            Number = Input2.nextInt();
        }

        if (Number == 1) {
            Encrypter encrypt = new Encrypter();
            encrypt.encrypt(SentInput);
            System.out.printf("%s", encrypt.Output);
        }
        if (Number == 2) {
            Decrypter decrypt = new Decrypter();
            decrypt.decrypt(SentInput);
            System.out.printf("%s", decrypt.Output);
        }

    }

}

