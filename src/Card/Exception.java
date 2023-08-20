package Card;
        import java.util.*;

        import main.java.Shapes;

public class Exception {
    public static void main(String[] args){
        LinkedList<String> cardDeck = new LinkedList<>();
        createCardDeck(cardDeck);
        System.out.println(cardDeck);
        findAndRemoveRandomCard(cardDeck);
        System.out.println(cardDeck);


    }

    private static void createCardDeck(LinkedList list){
        String card = null;
        Random random = new Random();
        int a;
        for (cardValue cardValue : cardValue.values()) {
            for (suitCard suitCard : suitCard.values()) {
                card = cardValue + " " + suitCard;
                a = random.nextInt(32);
                System.out.println(a);
                list.add(a,card);
//                list.add(card);
            }
        }

    }
    private static void findAndRemoveRandomCard(LinkedList list) {
        Random random = new Random();
        int a = random.nextInt(32);
        System.out.println(list.get(a));
        list.remove(a);
    }
}

