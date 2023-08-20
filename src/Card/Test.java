package Card;
import java.util.Random;
import main.java.Shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Test {
    public static void main(String[] args){
        ArrayList<String> cardDeck = new ArrayList();
        createCardDeck(cardDeck);
        System.out.println(cardDeck);
        findAndRemoveRandomCard(cardDeck);
        System.out.println(cardDeck);

    }

    private static void createCardDeck(ArrayList<String> list){
        String card = null;
        for (cardValue cardValue : cardValue.values()) {
            for (suitCard suitCard : suitCard.values()) {
                card = cardValue + " " + suitCard;
                list.add(card);
            }
        }

    }
    private static void findAndRemoveRandomCard(ArrayList<String> list) {
        Random random = new Random();
        int a = random.nextInt(32);
        System.out.println(list.get(a));
        list.remove(a);
    }
}
