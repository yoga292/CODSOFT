import java.util.*;
class BankAcc {
    private double balance;
    public BankAcc(double initialBal) {
        this.balance=initialBal;
    }
    public double getBalance() {
        return balance;
    }
    public void withdraw(double amount) {
        if (amount>0 && balance>=amount) {
            balance-=amount;
        }
    }
    public void deposit(double amount) {
        if (amount>0) {
            balance+=amount;
        }
    }
}
class ATM {
    private BankAcc account;
    public ATM(BankAcc account) {
        this.account=account;
    }
    public void withdraw(double amount) {
        if(amount>0 && account.getBalance()>=amount) {
            account.withdraw(amount);
            System.out.println("Withdrawal successful.Your new balance is: "+account.getBalance());
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public void deposit(double amount) {
        if (amount>0) {
            account.deposit(amount);
            System.out.println("Deposit successful. Your new balance is: " + account.getBalance());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void checkBalance() {
        System.out.println("Your current balance is: " + account.getBalance());
    }
}
public class ATMInterface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAcc account=new BankAcc(1000);
        ATM atm=new ATM(account);
        int ch;
        do
        {
            System.out.println("Choose an option:");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter amount to withdraw:");
                    double withdrawamo = sc.nextDouble();
                    atm.withdraw(withdrawamo);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit:");
                    double depositamo= sc.nextDouble();
                    atm.deposit(depositamo);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM");
                    break;
                default:
                    System.out.println("Please try again..");
            }
        } while(ch!=4);
    }
}
