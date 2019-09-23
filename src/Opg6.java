import java.util.Scanner;

public class Opg6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The imperial system is vastly inferior to the metric system, so i refuse to even attempt that.");
        System.out.println("I will instead use the metric system that i am more familiar with.");
        System.out.println("Enter your height in meters:");
        double height = input.nextDouble();
        System.out.println("Enter your weight in KG:");
        double weight = input.nextDouble();
        double BMI = weight/(height*height);
        if(BMI<18.5){
            System.out.println("Your BMI is: "+BMI+" which is underweight");
        } else if(BMI<25 && BMI>=18.5){
            System.out.println("Your BMI is: "+BMI+" which is normal");
        } else if(BMI>=25 && BMI<30){
            System.out.println("Your BMI is: "+BMI+" which is overweight");
        } else if(BMI>=30){
            System.out.println("Your BMI is: "+BMI+" which is fat is fuck lol");
        }
    }
}
