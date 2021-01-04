public class Checking extends Account{
  //Properties specific to Checking account: debit card, pin
   int debitCardNumber;
   int debitCardpin;

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


  //Call constructor to initialize checking account properties
public Checking(String name, String sSN, double initialDeposit){
 super(name,sSN,initialDeposit);
  System.out.println("New Checking Account");
}

  //List methods specific to checking account

}
