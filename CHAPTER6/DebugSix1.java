package CHAPTER6;

// Start with a penny
// double it every day
// how much do you have in a 30-day month?
public class DebugSix1
{
   public static void main(String args[])
   {
      final int DAYS = 30;
      double money = 0.01;
      int day = 1;
      do {
        System.out.println("After day " + day +
        " you have " + money);
        money = 2 * money;
        day++;
     }
      while(DAYS >= day);
   }
}