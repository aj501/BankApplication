public class BankAccountApp {
  public static void main(String[] args) {

    Checking ck1 = new Checking("Alex Pham","123456789", 1500);
    Savings sv1 = new Savings("Anh Nguyen","4324567868", 2500);
    ck1.showInfo();
    System.out.println("***********");
    sv1.showInfo();
    sv1.deposit(5000);
    sv1.withdraw(200);
    sv1.transfer("Checking", 1000);
  }
}
