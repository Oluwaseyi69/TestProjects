package BankApp;

public class AtmMachine {
    public static void main(String[] args) {
//        private Scanner scanner = new Scanner(String prompt);
//        display welcome message
//            open account, deposit, withdraw, check balance
        String mainMenu = """
                 Welcome to Swiss Bank of Nigeria
                 press
                 1. create account
                 2. deposit
                 3. withdraw
                 4. transfer
                 5.check balance
                 6.Exit Application


                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> createAccount();
//            case '2' -> deposit();
//            case '3' -> withdraw();
//            case '4' -> transfer();
//            case '5' -> checkBalance();
//            case '6' -> exitApplication();
//            default -> mainMenu;
        }


    }

    private static void createAccount() {
        String firstName = input("enter first name ");
        String lastName = input("enter last name ");

    }

    private static String input(String prompt) {
        return prompt;
    }
}