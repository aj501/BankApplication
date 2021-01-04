import javax.management.remote.JMXAddressable;

public class Savings extends Account{
  int getSafetyDepositID;
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

  @Override
  String showInfo() {
    return null;
  }
  //Properties specific to Savings account:

  //Call constructor to initialize checking account properties
public Savings(String name, String sSN, double initialDeposit){
    super(name, sSN, initialDeposit);
  System.out.println("New Saving Account: ");
}

  //List methods specific to checking account
}
