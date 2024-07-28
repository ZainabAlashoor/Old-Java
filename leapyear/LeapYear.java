package old.leapyear;
import java.util.Scanner;

//a leap year is when YEAR is divisiable by 4 but not 100 
//OR if it is divisiable by 400 

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        try {
        System.out.print("Enter a year: ");
        int year = in.nextInt(); 
        boolean isLeap = (year%4==0 && year%100!=0 || year%400==0); 
        System.out.println(year + " is leap year? " + isLeap); 
        }
        finally {
            in.close();
        }
    }
}
