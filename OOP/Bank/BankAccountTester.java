package OOP.Bank;
import java.util.Scanner; 
public class BankAccountTester 
{
 public static void main(String[] args) 
 { 
 Scanner keyboard = new Scanner(System.in); 
 double amount; 
 boolean ok;
 BankAccount account1 = new BankAccount("99786754","Susan Richards"); 
 System.out.print("Enter amount to deposit: "); 
 amount = keyboard.nextDouble(); 
 account1.deposit(amount); 
 System.out.println("Deposit was made"); 
 System.out.println("Balance = " + account1.getBalance()); 
 System.out.println(); 
 System.out.print("Enter amount to withdraw: "); 
 amount = keyboard.nextDouble(); 
 ok = account1.withdraw(amount); // get the return value of the withdraw method
 if(ok) 
 { 
 System.out.println("Withdrawal made"); 
 } 
 else 
 { 
 System.out.println("Insufficient funds"); 
 } 
 System.out.println("Balance = " + account1.getBalance()); 
 System.out.println(); 
 } 
}
// Two sample runs from this program are shown below. In the first the withdrawal was successful:
// Enter amount to deposit: 1000
// Deposit was made
// Balance = 1000.0
// Enter amount to withdraw: 400
// Withdrawal made
// Balance = 600.0
// In the second there were not sufficient funds to make the withdrawal:
// Enter amount to deposit: 1000
// Deposit was made
// Balance = 1000.0
// Enter amount to withdraw: 1500
// Insufficient funds
// Balance = 1000.0