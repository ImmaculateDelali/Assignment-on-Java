// // Another method created to run FOR statements to sum even numbers between 11 and 103

public class FourthMethod {
    
public static void EvenNumbers() {
    int sum = 0;
    for (int i =11; i<=103; i++){
        if(i %2 ==0)
        sum+=i;
        System.out.println(sum);
    }
}
}
