package OOP.Bank;

/**
 * BankAccount
 */
public class BankAccount {

  private String accountNumber;
  private String accountName;
  private double accountBalance;
  BankAccount(String accountNumber,String accountName){
    this.accountNumber = accountNumber;
    this.accountName = accountName;
    this.accountBalance = 0;
  }
  public String getAccountNumber(){
    return accountNumber;
  }
  public String getAccountName(){
    return accountName;
  }
  public double getBalance(){
    return accountBalance;
  }

  public void deposit(double item){
    accountBalance += item; 
  }
  public boolean withdraw(double item){
    if(accountBalance > item){
      accountBalance -= item;
      return true;
    }
    return false;
  }
}