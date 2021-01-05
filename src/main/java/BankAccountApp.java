public class BankAccountApp {
  public static void main(String[] args) {

    Checking ck1 = new Checking("Alex Pham","123456789", 1500);
    Savings sv1 = new Savings("Anh Nguyen","4324567868", 2500);
    System.out.println("**********************");
    ck1.showInfo();
    ck1.compound();
    System.out.println("**********************");
    sv1.showInfo();
    sv1.compound();
    System.out.println("**********************");

  }
}
