public class Opg24 {
    public static void main(String[] args) {
        int rankInt = (int)(Math.random()*13+1);
        String rank = null;
        switch (rankInt){
            case 1: rank = "Ace"; break;
            case 2: rank = "2"; break;
            case 3: rank = "3"; break;
            case 4: rank = "4"; break;
            case 5: rank = "5"; break;
            case 6: rank = "6"; break;
            case 7: rank = "7"; break;
            case 8: rank = "8"; break;
            case 9: rank = "9"; break;
            case 10: rank = "10"; break;
            case 11: rank = "Jack"; break;
            case 12: rank = "Queen"; break;
            case 13: rank = "King"; break;
        }
        int suitInt = (int)(Math.random()*4+1);
        String suit = null;
        switch (suitInt){
            case 1: suit = "Clubs"; break;
            case 2: suit = "Diamonds"; break;
            case 3: suit = "Hearts"; break;
            case 4: suit = "Spades"; break;
        }
        System.out.println("-----------pick-a-card--------------");
        System.out.println("The card you picked is "+rank+" of "+suit);
    }
}
