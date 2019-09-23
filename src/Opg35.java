import java.util.Scanner;

public class Opg35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int i = input.nextInt();
        if (i%2>0){
            System.out.println(i+" is an odd number.");
        } else System.out.println(i+" is an even number.");
    }
}
