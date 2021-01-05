public class Checking extends Account {

  int debitCardNumber;
  int debitCardPin;

  //Call constructor to initialize checking account properties
  public Checking(String name, String sSN, double initialDeposit) {
    super(name, sSN, initialDeposit);
    accountNumber = "2" + accountNumber;
    setDebitCard();
  }

  @Override
  public void setRate() {
    rate = getBaseRate() *.15;
  }

  private void setDebitCard() {
    debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
    debitCardPin = (int) (Math.random() * Math.pow(10, 4));
  }

  public void showInfo() {
    super.showInfo();
    System.out.println("Your Checking Account Features: "
        + "\n  Debit Card Number: " + debitCardNumber
        + "\n  Debit Card Pin: " + debitCardPin);
  }

}
