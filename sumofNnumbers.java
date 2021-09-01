import java.util.Scanner;

public class sumofNnumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        // sum of n numbers taken from the user
        int i = 1;
        int sum = 0;
        while( i <= n)
        {
            sum = sum + i;
            i = i+1;
        }
        System.out.println(sum);
   }
}