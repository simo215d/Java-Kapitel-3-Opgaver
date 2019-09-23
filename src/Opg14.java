import java.util.Scanner;

public class Opg14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type heads or tails and i will tell you if you guessed right!");
        String guess = input.next();
        //(int)(Math.random()) Math.random generates float from 0 to 1, excluding 1. (int rounds down to nearest int)
        //we multiply Math.random()*2 so that generates float from 0 to 2, excluding 2. (int rounds down to nearest int)
        int result = (int)(Math.random()*2);
        String resultString;
        if (result == 0)
            resultString = "heads";
            else resultString = "tails";
        System.out.println("You guessed: "+guess);
        System.out.println("Coinflip resulted in: "+result+" = "+resultString);
        if (guess.equals(resultString))
            System.out.println("You guessed right!");
        if (!guess.equals(resultString))
            System.out.println("You were wrong, and shall now walk the plank");
    }
}
