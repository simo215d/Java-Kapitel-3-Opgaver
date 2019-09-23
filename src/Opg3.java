import java.util.Scanner;

public class Opg3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        System.out.println("For the first equation (ax+by = e) and second equation (cd+dy = f) enter their values:");
        a= input.nextInt();
        b= input.nextInt();
        c= input.nextInt();
        d= input.nextInt();
        e= input.nextInt();
        f= input.nextInt();
        if(a * d - b * c != 0) {
            int x = (e * d - b * f) / (a * d - b * c);
            int y = (a * f - e * c) / (a * d - b * c);
            System.out.println("x= " + x + " and y=" + y);
        } else {
            System.out.println("There is no solution");
        }
    }
}
