import java.util.Scanner;

public class Opg12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3 digit int. I will tell you if its a palindrome :D");
        int x = input.nextInt();
        //123 % 10 = is always the first number to the left of the decimals = 3 = last number
        // 123/100=1.23 and then operate modulus on this and 1 is now first number
        int firstInt = (x/100)%10;
        int lastInt = x%10;
        if (firstInt == lastInt){
            System.out.println("Palindrome!");
        } else
            System.out.println("Not Palindrome");
    }
}
