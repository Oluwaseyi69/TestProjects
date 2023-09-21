package contactApp;

import javax.swing.*;

public class PhonebookMain {
    private static Phonebook phonebook = new Phonebook();
    private static String storedName = "";
    public static void main(String[] args) {
        welcomeNote();
        firstDisplay();
    }

    public static void welcomeNote(){
        display("""
                Welcome to Phonebook
                """);
    }

    public static void firstDisplay(){
        display("""
                1-> Create contact
                2-> Delete account
                3-> Exit
                """);

        String userInput = inputMethod("Enter a number: ");
        if (userInput.equals("1")) {
            newContact();
        } else if (userInput.equals("2")) {
            deleteContact();
        } else if (userInput.equals("3")) {
            lastDisplay();
        } else {
            display("Enter a valid number");
        }
    }

    public static void newContact() {
        String name = inputMethod("Enter Your name:");
        String address = inputMethod("Enter your address: ");
        String telephone = inputMethod("Enter your Phone Number");
        String email = inputMethod("Enter your Email");
        phonebook.addContact(name,address,telephone,email);
        storedName = name;
        display("Saved Successfully");
        firstDisplay();
    }
    public static void deleteContact(){
        String name = inputMethod("Enter your name");
        String address = inputMethod("Enter your address: ");
        String telephone = inputMethod("Enter your Phone Number");
        String email = inputMethod("Enter your Email");
        phonebook.deleteContact(name, address, telephone, email);
        display("Deleted Successfully");
        firstDisplay();
    }

   public static void lastDisplay(){
        display("Thanks for using Our Phonebook.");
   }


    public static String inputMethod(String prompt){
        return JOptionPane.showInputDialog(null,prompt);

    }
    public static void display(String message){
        JOptionPane.showMessageDialog(null, message);
    }

}
