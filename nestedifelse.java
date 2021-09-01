import java.util.Scanner;

public class nestedifelse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if(a > b){
            System.out.println("a is greater then b");
        }
        else if(b > a){
                System.out.println("b is greater then a ");
        } else {
                System.out.println("both are equal");
            }
        }

    }
