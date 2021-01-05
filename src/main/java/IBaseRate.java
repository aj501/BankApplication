public interface IBaseRate {
  //In case interest rate is from outside of our project we cant fetch it using interface
  default double getBaseRate() {
    return 2.5;
  }
}
