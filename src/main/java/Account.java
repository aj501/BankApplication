public abstract class Account implements IRate {
  //Parent class of Checking and Savings
  ///Use abstract as we don't want to create object from the account
  // List of common properties for checking and savings accounts
  String name;
  String sSN;

  double balance;

  String accountNumber;
  double rate;
  static int index = 10000;

  //List of common methods
  abstract void deposit();
  abstract void withdraw();
  abstract void transfer();



  //Constructor to set base properties and initialize account
  public Account(String name, String sSN, double initialDeposit) {
    this.name = name;
    this.sSN = sSN;
    balance = initialDeposit;

    //set account number
    index++;
    this.accountNumber = setAccountNumber();
  }

  private String setAccountNumber() {
    String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
    int uniqueID = index;
    int randomNumber = (int) (Math.random() * Math.pow(10,3));
    return lastTwoOfSSN + uniqueID + randomNumber;

  }
  public void showInfo() {
    System.out.println(
        "NAME: " + name +
        "\nACCOUNT NUMBER: " + accountNumber +
        "\nBALANCE: " + balance);
  }


//  ## Application Requirements:
//      - Read a .csv file of names, social security numbers, account type, and initial deposit
//- Use proper data structure to hold all these accounts
//
}
