import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class conditionalsandoperator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if( a>0 && b>0 ){
            System.out.println("both no are positive");
        }else {
            System.out.println("both are not positive");
        }

    
    }
}