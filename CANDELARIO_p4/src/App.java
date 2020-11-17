import java.util.*;
import java.io.*;
import java.nio.*;


public class App {


    public static String newFilename;

    public static void main(String[] args) throws IOException {
        TaskList tasklist = new TaskList();
        String newFilename = "filename.txt";
        int choice1 = App.MainMenu();
        if(choice1 == 1) {
            File f = new File(newFilename);
            //FileReader reader = new FileReader(newFilename);
            //FileWriter writer = new FileWriter(newFilename);
            tasklist.beginFile();
            System.out.print("new task list has been created\n\n");
            int choice2 = App.operationMenu();
            if(choice2 == 1) tasklist.showList();
            if(choice2 == 2) tasklist.addItem();
        }
        if(choice1 == 2) {
            findFile();
            int choice2 = App.operationMenu();
            if(choice2 == 1) tasklist.showList();
            if(choice2 == 2) tasklist.addItem();
        }

    }

    public static int MainMenu() {
        int choice1;
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Main Menu\n--------\n\n1) Create a new list\n2) Load an existing list\n3) Quit\n");
            choice1 = input.nextInt();
            if (choice1 != 1 && choice1 != 2 && choice1 != 3) {
                throw new IllegalArgumentException("Invalid input chosen.");
            }
            return choice1;
        }
        catch(IllegalArgumentException i) {
            System.out.println("Invalid input chosen. Please choose another.");
            choice1 = input.nextInt();
            if (choice1 != 1 && choice1 != 2 && choice1 != 3) {
                throw new IllegalArgumentException("Invalid input chosen.");
            }
            return choice1;
        }

    }

    public static int operationMenu() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("List Operation Menu\n--------\n" +
                    "1) view the list\n2) add an item\n3) edit an item\n" +
                    "4) remove an item\n5) mark an item as completed\n6) unmark an item as completed\n" +
                    "7) save the current list\n8) quit to the main menu\n");
            int choice2 = input.nextInt();
            if (choice2 != 1 && choice2 != 2 && choice2 != 3 &&
                    choice2 != 4 && choice2 != 5 && choice2 != 6 &&
                    choice2 != 7 && choice2 != 8) {
                throw new IllegalArgumentException("Invalid input chosen.");
            }
            return choice2;
        } catch (IllegalArgumentException i) {
            System.out.println("Invalid input chosen. Please choose another.");
            int choice2 = input.nextInt();
            if (choice2 != 1 && choice2 != 2 && choice2 != 3 &&
                    choice2 != 4 && choice2 != 5 && choice2 != 6 &&
                    choice2 != 7 && choice2 != 8) {
                throw new IllegalArgumentException("Invalid input chosen.");
            }
            return choice2;
        }
    }

    public static void findFile() {
        String filename = null;
        String filenameSearch = "file";
        Scanner input = new Scanner(System.in);
        try {
            File f = new File(filenameSearch);
            System.out.print("Enter the filename to load: ");
            filenameSearch = input.next();
            if(f.exists() && !f.isDirectory()) {
                System.out.print("task list has been loaded\n\n");
                filenameSearch = filename;
            }
            else throw new FileNotFoundException("File not Found");
        } catch (FileNotFoundException i) {
            try {
                File f = new File(filenameSearch);
                if (f.exists() && !f.isDirectory()) {
                    System.out.print("task list has been loaded\n\n");
                    filenameSearch = filename;
                } else throw new FileNotFoundException("File not Found");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        ;
    }
}
