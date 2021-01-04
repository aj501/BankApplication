public class Checking extends Account{
  //Properties specific to Checking account: debit card, pin
   int debitCardNumber;
   int debitCardPin;

  @Override
  void deposit() {

  }

  @Override
  void withdraw() {

  }

  @Override
  void transfer() {

  }


  //Call constructor to initialize checking account properties
public Checking(String name, String sSN, double initialDeposit){
 super(name,sSN,initialDeposit);
  accountNumber = "2"+ accountNumber;
}
public void showInfo() {
    super.showInfo();
  System.out.println("ACCOUNT TYPE: Checking ");
}

  //List methods specific to checking account

}
