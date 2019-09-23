import java.util.Scanner;

public class Opg17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";
        System.out.println("Choose your weapon by typing 1, 2 or 3 (1=rock, 2=paper, 3=scissors)");
        int chosenWeaponNumber = input.nextInt();
        String chosenWeapon;
        if (chosenWeaponNumber == 1){
            chosenWeapon = rock;
        } else if (chosenWeaponNumber == 2){
            chosenWeapon = paper;
        } else chosenWeapon = scissors;
        String computerWeapon;
        int computerWeaponNumber = (int)(Math.random()*3+1);
        if (computerWeaponNumber == 1){
            computerWeapon = rock;
        } else if (computerWeaponNumber == 2){
            computerWeapon = paper;
        } else computerWeapon = scissors;
        if (chosenWeapon.equals("rock") && computerWeapon.equals("rock")){
            System.out.println("You chose "+chosenWeapon);
            System.out.println("Computer chose "+computerWeapon);
            System.out.println("It is a draw...");
        }
        if (chosenWeapon.equals("rock") && computerWeapon.equals("paper")){
            System.out.println("You chose "+chosenWeapon);
            System.out.println("Computer chose "+computerWeapon);
            System.out.println("You lost XD");
        }
        if (chosenWeapon.equals("rock") && computerWeapon.equals("scissors")){
            System.out.println("You chose "+chosenWeapon);
            System.out.println("Computer chose "+computerWeapon);
            System.out.println("You won, congratulations bro");
        }
        if (chosenWeapon.equals("paper") && computerWeapon.equals("rock")){
            System.out.println("You chose "+chosenWeapon);
            System.out.println("Computer chose "+computerWeapon);
            System.out.println("You won, congratulations bro");
        }
        if (chosenWeapon.equals("paper") && computerWeapon.equals("paper")){
            System.out.println("You chose "+chosenWeapon);
            System.out.println("Computer chose "+computerWeapon);
            System.out.println("It is a draw...");
        }
        if (chosenWeapon.equals("paper") && computerWeapon.equals("scissors")){
            System.out.println("You chose "+chosenWeapon);
            System.out.println("Computer chose "+computerWeapon);
            System.out.println("You lost XD");
        }
        if (chosenWeapon.equals("scissors") && computerWeapon.equals("rock")){
            System.out.println("You chose "+chosenWeapon);
            System.out.println("Computer chose "+computerWeapon);
            System.out.println("You lost XD");
        }
        if (chosenWeapon.equals("scissors") && computerWeapon.equals("paper")){
            System.out.println("You chose "+chosenWeapon);
            System.out.println("Computer chose "+computerWeapon);
            System.out.println("You won, congratulations bro");
        }
        if (chosenWeapon.equals("scissors") && computerWeapon.equals("scissors")){
            System.out.println("You chose "+chosenWeapon);
            System.out.println("Computer chose "+computerWeapon);
            System.out.println("It is a draw...");
        }
    }
}
