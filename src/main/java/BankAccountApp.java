import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
  public static void main(String[] args) {

    List<Account> account = new LinkedList<>();

    String file = "NewBankAccounts.csv";
    //Read in CSV file
    try {
      List<String[]> newAccountHolder = utilities.CSV.read(file);
      for (String[] accountHolder : newAccountHolder) {
        String name = accountHolder[0];
        String sSN = accountHolder[1];
        String accountType = accountHolder[2];
        double initialDeposit = Double.parseDouble(accountHolder[3]);
        if (accountType.equals("Savings")) {
          account.add(new Savings(name, sSN, initialDeposit));
        } else if (accountType.equals("Checking")) {
          account.add(new Checking(name, sSN, initialDeposit));
        } else {
          System.out.println("Account type reading error!");
        }
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    for (Account acc : account) {
      System.out.println("*************************************");
      acc.showInfo();
    }
    account.get(0).deposit(6000);
    account.get(0).printBalance();
    account.get(0).withdraw(250);
    account.get(0).compound();
  }
}
