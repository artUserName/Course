package Card;
import java.util.*;

import main.java.Shapes;

public class Test2 {
    public static void main(String[] args){
        LinkedList<String> cardDeck = new LinkedList<>();
        createCardDeck(cardDeck);
        System.out.println(cardDeck);
        findAndRemoveRandomCard(cardDeck);
        System.out.println(cardDeck);


    }

    private static void createCardDeck(LinkedList list){
        String card = null;
        for (cardValue cardValue : cardValue.values()) {
            for (suitCard suitCard : suitCard.values()) {
                card = cardValue + " " + suitCard;
                list.add(card);
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
