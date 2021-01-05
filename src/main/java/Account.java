public abstract class Account implements IBaseRate {

  String name;
  String sSN;

  double balance;

  String accountNumber;
  double rate;
  static int index = 10000;

  //List of common methods
  public void deposit(double amount) {
    balance = balance + amount;
  }

  public void withdraw(double amount) {
    balance = balance - amount;
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

  public void showInfo() {
    System.out.println(
        "NAME: " + name
            + "\nACCOUNT NUMBER: " + accountNumber
            + "\nBALANCE: " + balance
            + "\nRATE: " + rate + "%");
  }
}
