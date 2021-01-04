import javax.management.remote.JMXAddressable;

public class Savings extends Account {
  int safetyDepositID;
  int safetyDepositBoxKey;


  @Override
  void deposit() {

  }

  @Override
  void withdraw() {

  }

  @Override
  void transfer() {

  }

  //Properties specific to Savings account:

  //Call constructor to initialize checking account properties
  public Savings(String name, String sSN, double initialDeposit) {
    super(name, sSN, initialDeposit);
    accountNumber = "1" + accountNumber;
    setSafetyDepositBox();

  }

  private void setSafetyDepositBox() {
    safetyDepositID = (int) (Math.random() * Math.pow(10, 3));
    System.out.println("Safety Deposit Box ID: " + safetyDepositID);
    safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    System.out.println("Safety Deposit Box key: " + safetyDepositBoxKey);
    System.out.println();
  }

  public void showInfo() {
    System.out.printf("ACCOUNT TYPE: Savings");
    super.showInfo();
    System.out.println("Your Savings Account Features: "
        + "\nSafety Deposit Box ID: " + safetyDepositID
        + "\nSafety Deposit Box key: " + safetyDepositBoxKey);
  }

  //List methods specific to checking account
}
