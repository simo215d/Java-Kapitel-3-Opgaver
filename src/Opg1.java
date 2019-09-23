import java.util.Scanner;

public class Opg1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = (Math.pow(b,2))-4*a*c;
        if(discriminant>0){
            System.out.println("The discriminant was greater than 0, so there are 2 roots");
            System.out.println("r1= "+(-b+(Math.pow(discriminant,0.5)))/(2*a));
            System.out.println("r2= "+(-b-(Math.pow(discriminant,0.5)))/(2*a));
        } else if(discriminant==0){
            System.out.println("The discriminant was equal to 0, so there is 1 root");
            System.out.println("r1= "+(-b+(Math.pow(discriminant,0.5)))/(2*a));
        } else if(discriminant<0){
            System.out.println("The discriminant was less than 0, so there are no roots");
        }
    }
}
