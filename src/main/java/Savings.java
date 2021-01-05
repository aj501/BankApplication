
public class Savings extends Account {

  //We want safety deposit ID and key available only in this class

  private int safetyDepositID;
  private int safetyDepositBoxKey;

  //Call constructor to initialize checking account properties

  public Savings(String name, String sSN, double initialDeposit) {
    super(name, sSN, initialDeposit);
    accountNumber = "1" + accountNumber;
    setSafetyDepositBox();
  }

  @Override
  public void setRate() {
    rate = getBaseRate() - .25;
  }

  private void setSafetyDepositBox() {
    safetyDepositID = (int) (Math.random() * Math.pow(10, 3));
    safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    System.out.println();
  }

  public void showInfo() {

    super.showInfo();
    System.out.println("Your Savings Account Features: "
        + "\n  Safety Deposit Box ID: " + safetyDepositID
        + "\n  Safety Deposit Box key: " + safetyDepositBoxKey);
  }

  //List methods specific to checking account
}
