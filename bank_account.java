import java.util.Scanner;

class bank_Account{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        while (true) {
            System.out.println("Welcome to the Bank Account Manager");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Checking Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. View Balance");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();
                    scanner.nextLine();  
                    account = new SavingsAccount(initialBalance);
                    System.out.println("Savings account created.");
                    break;
                    
                case 2:
                    System.out.print("Enter initial balance: ");
                    initialBalance = scanner.nextDouble();
                    scanner.nextLine();  
                    account = new CheckingAccount(initialBalance);
                    System.out.println("Checking account created.");
                    break;
                    
                case 3:
                    if (account == null) {
                        System.out.println("No account exists. Please create an account first.");
                        break;
                    }
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();  
                    account.deposit(depositAmount);
                    System.out.println("Deposited $" + depositAmount);
                    break;
                    
                case 4:
                    if (account == null) {
                        System.out.println("No account exists. Please create an account first.");
                        break;
                    }
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); 
                    boolean success = account.withdraw(withdrawAmount);
                    if (success) {
                        System.out.println("Withdrew $" + withdrawAmount);
                    } else {
                        System.out.println("Insufficient funds or invalid operation.");
                    }
                    break;
                    
                case 5:
                    if (account == null) {
                        System.out.println("No account exists. Please create an account first.");
                        break;
                    }
                    System.out.println("Current balance: $" + account.getBalance());
                    break;
                    
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}

abstract class BankAccount {
    protected double balance;
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public abstract void deposit(double amount);
    
    public abstract boolean withdraw(double amount);
    
    public abstract void applyMonthlyUpdate();
}

class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04;
    
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    
    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    
    @Override
    public boolean withdraw(double amount) {
        if (amount > bal ance) {
            return false;
        }
        balance -= amount;
        return true;
    }
    
    @Override
    public void applyMonthlyUpdate() {
        balance += balance * INTEREST_RATE;
    }
}

class CheckingAccount extends BankAccount {
    private static final double MIN_BALANCE = 500;
    private static final double FEE = 50;
    
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }
    
    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    
    @Override
    public boolean withdraw(double amount) {
        if (balance - amount < 0) {
            return false;
        }
        balance -= amount;
        if (balance < MIN_BALANCE) {
            balance -= FEE;
        }
        return true;
    }
    
    @Override
    public void applyMonthlyUpdate() {
        if (balance < MIN_BALANCE) {
            balance -= FEE;
        }
    }
}
