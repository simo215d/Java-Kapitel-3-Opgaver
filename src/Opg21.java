import java.util.Scanner;

public class Opg21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h; //day in week
        int q; //day in month
        int m; //month
        int j; //year/1000
        int k; //centery year%100
        int yr; //year
        System.out.println("Enter year (eg: 2012)");
        yr = input.nextInt();
        System.out.println("Enter month");
        m = input.nextInt();
        if (m == 1){
            m = 13;
            yr -= 1;
        } else if (m == 2){
            m = 14;
            yr -= 1;
        }
        System.out.println("Enter the day of the month (1-31:)");
        q = input.nextInt();
        j = yr/100;
        k = yr%100;
        h = (q+((26*(m+1))/10)+k+(k/4)+(j/4)+5*j)%7;
        switch (h){
            case 0: System.out.println("Day of the week is saturday"); break;
            case 1: System.out.println("Day of the week is sunday"); break;
            case 2: System.out.println("Day of the week is monday"); break;
            case 3: System.out.println("Day of the week is tuesday"); break;
            case 4: System.out.println("Day of the week is wednesday"); break;
            case 5: System.out.println("Day of the week is thursday"); break;
            case 6: System.out.println("Day of the week is friday"); break;
        }
    }
}
