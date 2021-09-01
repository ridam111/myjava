import java.util.Scanner;
 // if-else 
public class conditionals {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);

     int a = s.nextInt();
     //int b = s.nextInt();
              // odd even
     if(a%2==0){
         System.out.println( "a is even");
     } else{
         System.out.println( "a is odd");
     }

    }
}