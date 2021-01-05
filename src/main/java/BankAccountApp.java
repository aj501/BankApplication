import java.io.FileNotFoundException;
import java.util.List;

public class BankAccountApp {
  public static void main(String[] args) {

    String file = "NewBankAccounts.csv";
    //Read in CSV file
    try {
      List<String[]> newAccountHolder = utilities.CSV.read(file);
      System.out.println("NEW ACCOUNT: ");
      System.out.println("Name\t\t  SSN\t\t AccountType\t InitialDeposit");
      for (String[] accountHolder : newAccountHolder) {

        String name = accountHolder[0];
        String sSN = accountHolder[1];
        String accountType = accountHolder[2];
        double initialDeposit = Double.parseDouble(accountHolder[3]);
        if(accountType.equals("Savings")){
          System.out.println("Open a savings account");
        }
        else if (accountType.equals("Checking")){
          System.out.println("Open a checking account");
        }
        else {
          System.out.println("Account type reading error!");
        }
        System.out.println(name + " " + sSN + " \t" + accountType + "\t\t\t$" + initialDeposit);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

  }
}
