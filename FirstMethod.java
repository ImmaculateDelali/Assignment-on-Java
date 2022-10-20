// Dynamic Method created using case statement 

public class FirstMethod {

public void anothermethod() {
    int Day = 7;
        String dayString = "";
        switch (Day) {
            case 1:
            dayString ="Sunday";
                break;

            case 2:
            dayString ="Monday";
                break;
            case 3:
            dayString = "Tuesday";
                break;

            case 4:
            dayString = "Wednesday";
                    break;  
            
             case 5:
                 dayString = "Thursday";
                    break;
                
            case 6:
                dayString = "Friday";
                     break;

             case 7:
            dayString = "Saturday";
                         break;
            default:
                break;
        }

        System.out.println(dayString);


}
}