import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // String str = s.nextLine();   for taking string input
         // char ch = str.charAt(0);   for one character at a time
         
       int  a=s.nextInt();
       int  b=s.nextInt();

        int c= a+b;
        System.out.println(c);
    }

}
