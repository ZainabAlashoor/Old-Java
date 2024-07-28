package old.gcd;
import java.util.Scanner; 

public class Greatestcommondivisor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        try{
        System.out.print("Enter first int: ");
        int n1 = in.nextInt();
        System.out.print("Enter second int: ");
        int n2 = in.nextInt();
        
        int gcd=1; //initial
        int k =2; //possible gcd
        
        while (k<=n1 && k<=n2){
            if(n1%k==0 && n2%k==0){
                gcd=k; 
            }
            k++; 
        }
        
        System.out.println("the greatest common divisor for "+ n1 +
                " and " + n2 + " is " + gcd); 
        }
        finally {
            in.close();
        }
        
    }
    
}
