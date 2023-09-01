package BankApp;

    public class Account {
        private double amount;
        private double balance;
        private String accountNumber;
        private String accountName;
        private double newBalance;
        private String pin;

        public Account(String accountNumber, String accountName, String pin){
            this.accountNumber = accountNumber;
            this.accountName = accountName;
            this.pin = pin;

        }
        public double deposit(double amount){
            if (amount <= 0){
                throw new IllegalArgumentException("Invalid Amount");
            }
            else {
                return (balance += amount);
            }
        }

//        create test cases for negative deposit and withdraw, and throw exception in class method
        public double withdraw(double amount, String pin) {
            validatePin(pin);
//            checkNegativeAmount(amount)
//            checkIfBalanceIsGreaterThanAmount(amount)
            if(amount > balance || amount < 0){
                throw new IllegalArgumentException("Enter amount within balance range");
            }
            else {
                return balance-= amount;
            }

        }

        public double getBalance() {
            return balance;
        }

        public void updatePin(String oldPin, String newPin) {
            validatePin(oldPin);
            this.pin = newPin;
        }
        public void validatePin(String pin){
            boolean isNotCorrectPin = !this.pin.equals(pin);
            if(isNotCorrectPin){
                throw new IllegalArgumentException("Pin is not correct");
            }
        }



        public void balance(double balance) {
            this.balance = balance;
        }



        public String getAccount() {
            return accountNumber + " " + accountName +" "+ pin;
        }

        public String getAccountNumber() {
            return accountNumber;
        }
    }


