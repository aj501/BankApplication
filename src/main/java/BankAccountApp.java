public class BankAccountApp {
  public static void main(String[] args) {

    Checking ck1 = new Checking("Alex Pham","123456789", 1500);
    Savings sv1 = new Savings("Anh Nguyen","4324567868", 2500);
    ck1.showInfo();
    System.out.println("***********");
    sv1.showInfo();




  //Read csv file and create accounts based on that data
  }
}
