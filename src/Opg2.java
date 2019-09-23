import java.util.Scanner;

public class Opg2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = (int) (Math.random()*10);
        int b = (int) (Math.random()*10);
        int result;
        System.out.println("Here are 2 random integers:"+a+" and "+b+". Enter the result if muliplied");
        result = input.nextInt();
        if (result == a*b){
            System.out.println("Very good!");
        } else {
            System.out.println("Youre pretty bad.");
        }
        a = (int) (Math.random()*10);
        b = (int) (Math.random()*10);
        int c = (int) (Math.random()*10);
        System.out.println("Here are 3 random integers:"+a+" and "+b+" and "+c+". Enter the result if muliplied");
        result = input.nextInt();
        if (result == a*b*c){
            System.out.println("Very good!");
        } else {
            System.out.println("Youre pretty bad.");
        }
    }
}
