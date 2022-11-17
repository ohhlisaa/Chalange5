public class BankAccount {
    int accountNumber;
    String customerName;
    String customerEmail;
    int customerPhone;
    double balance;

    public BankAccount(int accNo, String name, String email, int phone, double initialAmt){
        accountNumber = accNo;
        customerName = name;
        customerEmail = email;
        customerPhone = phone;
        balance = initialAmt;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

    public double Deposit(double amt){
        if (amt > 0){
            balance += amt;
        }
        else {
            System.out.println("Please enter a positive amount");
        }
        return balance;
    }

    public double Withdraw(double amt){
        if (amt < 0 ){
            System.out.println("Please eanter a positive amount");
        }
        else if (amt > balance){
            System.out.println("Saldo tidak mencukupi");
        }
        else {
            balance -= amt;
        }
        return balance;
    }

    public void DisplayDetails(){
        System.out.println("Account Number\t Customer Name\t Customer Email\t Customer Phone\t Balance");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(accountNumber + "\t\t" + customerName + "\t\t" + customerEmail + "\t\t" + customerPhone + "\t\t" + balance);
    }
}
