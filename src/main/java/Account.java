public abstract class Account implements IBaseRate {

  private String name;
  private String sSN;

  private double balance;

  protected String accountNumber;
  protected double rate;
  static int index = 10000;

  //List of common methods
  public void deposit(double amount) {
    balance = balance + amount;
    printBalance();
  }

  public void withdraw(double amount) {
    balance = balance - amount;
    printBalance();
  }

  public void transfer(String destinationAccount, double amount) {
    balance = balance - amount;
    System.out.println("Transferring to " + destinationAccount + " an amount of: $" + amount);
    printBalance();
  }

  public void printBalance() {
    System.out.println("Your current balance is: $" + balance);
  }
  //Constructor to set base properties and initialize account
  public Account(String name, String sSN, double initialDeposit) {
    this.name = name;
    this.sSN = sSN;
    balance = initialDeposit;

    //set account number

    index++;
    this.accountNumber = setAccountNumber();
    //set rate

    setRate();
  }

  public abstract void setRate();

  private String setAccountNumber() {
    String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
    int uniqueID = index;
    int randomNumber = (int) (Math.random() * Math.pow(10, 3));
    return lastTwoOfSSN + uniqueID + randomNumber;
  }
  public void compound() {
    double accruedInterest = balance * (rate/100);
    System.out.println("Accrued Interest: " + accruedInterest);
    balance = balance + accruedInterest;
    printBalance();
  }

  public void showInfo() {
    System.out.println(
        "NAME: " + name
            + "\nACCOUNT NUMBER: " + accountNumber
            + "\nBALANCE: " + balance
            + "\nRATE: " + rate + "%");
  }
}
