import java.util.Scanner;

public class Opg8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 integers. They will sort them non-decreasingly");
        int a, b, c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if (a<=b && b<=c){
            System.out.println((a)+""+(b)+""+(c));
        } else if (a<=c && c<=b){
            System.out.println((a)+""+(c)+""+(b));
        } else if (b<=a && a<=c){
            System.out.println((b)+""+(a)+""+(c));
        } else if (b<=c && c<=b){
            System.out.println((b)+""+(c)+""+(a));
        } else if (c<=b && b<=a){
            System.out.println((c)+""+(b)+""+(a));
        } else if (c<=a && a<=b){
            System.out.println((c)+""+(a)+""+(b));
        }
    }
}
