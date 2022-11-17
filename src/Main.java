import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int accountNumber;
        String customerName;
        String customerEmail;
        int customerPhone;
        double balance;
        BankAccount ba;
        int choice = 4;
        double amt;

        Scanner in = new Scanner(System.in);

        System.out.println("Creating New Account");
        System.out.println("--------------------");
        System.out.println("Enter Account Number : ");
        accountNumber = in.nextInt();
        in.nextLine();
        System.out.println("Enter Customer Name : ");
        customerName = in.nextLine();
        System.out.println("Enter Customer Email : ");
        customerEmail = in.nextLine();
        System.out.println("Enter Customer Phone : ");
        customerPhone = in.nextInt();
        System.out.println("Enter Customer Initial Deposit : ");
        balance = in.nextDouble();

        ba = new BankAccount();
        ba.setAccountNumber(accountNumber);
        ba.setCustomerName(customerName);
        ba.setCustomerEmail(customerEmail);
        ba.setCustomerPhone(customerPhone);
        ba.setBalance(balance);

        do {
            System.out.println("\n");
            System.out.println("   Transaction");
            System.out.println("---------------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Details");
            System.out.println("4. Exit Program");
            System.out.println("---------------");
            System.out.println("Please Enter Your Choice -> ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the Amount : ");
                    amt = in.nextDouble();
                    balance = ba.Deposit(amt);
                    System.out.println("Current Balance is : " + balance);
                    break;
                case 2:
                    System.out.println("Enter the Amount : ");
                    amt = in.nextDouble();
                    balance = ba.Withdraw(amt);
                    System.out.println("Current Value is : " + balance);
                    break;
                case 3:
                    ba.DisplayDetails();
                    break;
                case 4:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Please Enter  a number between 1 and 4");
            }
        } while (choice != 4);
    }
}