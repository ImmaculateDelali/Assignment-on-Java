import java.time.DayOfWeek;

// Creating public and dynamic methods

public class TryingMethods {
    // main method
    public static void main(String[] args) {
        FourthMethod teste = new FourthMethod();
        
    }
// static method with a switch statement
  /*   public static void FirstMethod() {
        int DayoftheWeek = 1;
        String day = "";
        switch (DayoftheWeek) {
            case 1:
                day ="Sunday";
                break;

            case 2:
                day ="Monday";

            case 3:
                day = "Tuesday";
                 
            default:
            System.out.println(day);
                break;
        }
    }
    */
// public method with an if statement
   /*  public static void SecondMethod() {
        int examScore = 100;
        if (marks == 80) {
            System.out.println("You had an A");
        } 
    }
    */

//dynamic method with a while loop to find the sum of numbers below 1000
   // public void ThirdMethod() {
        
    //}
    //dynamic method with a while loop to find the sum of even numbers between 12 and 103
    public void FourthMethod() {
        int range = 12;
        while (range <= 103){
            System.out.println("sum" + range);
            range +=range;
        }
    }
    

}
