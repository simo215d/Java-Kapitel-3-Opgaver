import java.util.Scanner;

public class Opg4 {
    public static void main(String[] args) {
        //(Math.random()*12) generetes number between 0 and 12 excluding 12. so we can never get 12 and we dont care about 0, so we + by 1
        //Opgaven beder specefikt om tal mellem 1 og 12.
        int month = (int)(Math.random()*12+1);
        System.out.println(month);
        switch (month){
            case 1:
                System.out.println("Jan"); break;
            case 2:
                System.out.println("Feb"); break;
            case 3:
                System.out.println("March"); break;
            case 4:
                System.out.println("Apr");break;
            case 5:
                System.out.println("May");break;
            case 6:
                System.out.println("Jun");break;
            case 7:
                System.out.println("Jul");break;
            case 8:
                System.out.println("Aug");break;
            case 9:
                System.out.println("Sep");break;
            case 10:
                System.out.println("Oct");break;
            case 11:
                System.out.println("Nov");break;
            case 12:
                System.out.println("Dec");break;
        }
    }
}
