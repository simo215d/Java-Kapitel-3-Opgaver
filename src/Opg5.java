import java.util.Scanner;

public class Opg5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter todays day (1: monday ... 6 saturday - 0 sunday)");
        int day = input.nextInt();
        System.out.println("Enter the number of days elsapsed since today:");
        int elapsed = input.nextInt();
        int convert = (day+elapsed)%7;
        switch (convert){
            case 0:
                System.out.println("future is sunday"); break;
            case 1:
                System.out.println("future is monday"); break;
            case 2:
                System.out.println("future is tuesday"); break;
            case 3:
                System.out.println("future is wednesday"); break;
            case 4:
                System.out.println("future is thursday"); break;
            case 5:
                System.out.println("future is friday"); break;
            case 6:
                System.out.println("future is saturday"); break;
        }
    }
}
