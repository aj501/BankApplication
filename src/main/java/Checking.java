import java.util.concurrent.ThreadLocalRandom;

public class Checking extends Account {

  //We want debit card number and pin only available inside this this class
  private long debitCardNumber;
  private int debitCardPin;

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
    //debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
    long min = (long)Math.pow(10, 11);
    long max = (long)Math.pow(10, 12);
    debitCardNumber = ThreadLocalRandom.current().nextLong(min,  max);
    debitCardPin = (int) (Math.random() * Math.pow(10, 4));
  }

  public void showInfo() {
    super.showInfo();
    System.out.println("Your Checking Account Features: "
        + "\n  Debit Card Number: " + debitCardNumber
        + "\n  Debit Card Pin: " + debitCardPin);
  }

}
