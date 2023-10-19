package DiaryApp;

import Diaries.Diaries;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DiaryMain {

    private static Diaries diaries = new Diaries();
    private static String storedUsername = "";

    public static void main(String[] args) {
        welcome();
        newAccount();
    }

    public static void welcome() {
        display("""
                ***********************************************************************
                    Welcome to your Diary app, the ultimate digital diary journal app
                        we welcome you with a sense of pride and excitement.
                ***********************************************************************
                """);
    }

    public static void newAccount() {
        display("""
                1. Create Diary Account
                2. Log in Existing Account
                3. Close
                """);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String userInput = scanner.nextLine();

        System.out.println("Create Diary Account");
        switch (userInput) {
            case "1" -> createAccount();
            case "2" -> login();
            case "3" -> System.exit(0);
            default -> {
                System.out.println("You Inputted an Invalid Entry");
                newAccount();
            }
        }
    }

    public static void createAccount() {
        String username = inputMethod("Enter your username: ");
        String password = inputMethod("Kindly Enter your password:");
        diaries.addDiary(username, password);
        storedUsername = username;
        display("\n" + "****Account Created Successfully****" + "\n");
        newAccount();

        if(username.isEmpty() || password.isEmpty()){
            throw new InputMismatchException("Username and Password Cannot be Empty");
        }
    }

    public static void login() {
        try {
            display("Log in");
            String username = inputMethod("Enter your username: ");
            String password = inputMethod ("Enter your password: ");
            storedUsername = username;
            diaries.findByUsername(username).validatePassword(password);
            options();
        } catch (IllegalArgumentException error) {
            display(error.getMessage());
            newAccount();
        }
    }

    public static void options() {
        System.out.print("""
                 1) Add Entry")
                 2) Delete Entry")
                 3) Update Entry")
                 4) Find Entry")
                 5) Main Menu")
                """);


        String userInput = inputMethod("Enter your option: ");

        if (userInput.equals("1")) {
            addEntry();
        } else if (userInput.equals("2")) {
            deleteEntry();
        } else if (userInput.equals("3")) {
            updateEntry();
        } else if (userInput.equals("4")) {
            findEntry();
        } else if (userInput.equals("5")) {
            newAccount();
        } else {
            display("Invalid Entry");
            options();
        }
    }


    public static void addEntry() {
        try {
            String id =  inputMethod("Enter your id: ");
            String title = inputMethod("Enter the title: ");
            String body = inputMethod("Enter the content: ");

            diaries.findByUsername(storedUsername).createEntry(Integer.parseInt(id),title,body);
            display("Your Entry is saved successfully");
            options();
        } catch (IllegalArgumentException error) {
            display(error.getMessage());
            addEntry();
        }
    }

    public static void deleteEntry() {
        try {
            String entryId = inputMethod("Enter Entry id: ");
            diaries.findByUsername(storedUsername).deleteEntry(Integer.parseInt(entryId));
            display("Entry Deleted");
            options();
        } catch (IllegalArgumentException error) {
            display(error.getMessage());
            deleteEntry();
        }
    }

    public static void updateEntry() {
        try {
            String entryId = inputMethod("Enter Entry id: ");
            String newUpdatedEntry = inputMethod("Kindly update entry: ");

//            diaries.findByUsername(storedUsername).findEntry(Integer.parseInt(entryId)).updateNewEntry(newUpdatedEntry);
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
            updateEntry();
        }
    }
    public static void findEntry(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Title: ");
        String title = scanner.next();

//        diaries.findByUsername(storedUsername).findEntry(Integer.parseInt(title));

    }

    public static String inputMethod(String prompt){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print(prompt);
//        return scanner.nextLine();
        JOptionPane.showInputDialog(prompt);

        return prompt;
    }
    public static void display(String message){
//        System.out.println(message);
        JOptionPane.showMessageDialog(null, message);
    }

}
