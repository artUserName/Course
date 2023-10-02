package Card;
import java.util.*;

public class TestSet {
    public static void main(String[] args){
        Set<String> cardDeck = new HashSet<>();
        createCardDeck(cardDeck);
        System.out.println(cardDeck);
        findAndRemoveRandomCard(cardDeck);
//        while (!cardDeck.isEmpty()){
//            System.out.println(cardDeck);
//            findAndRemoveRandomCard(cardDeck);
//        }
    }

    private static void createCardDeck(Set<String> list){
        String card = null;
        for (cardValue cardValue : cardValue.values()) {
            for (suitCard suitCard : suitCard.values()) {
                card = cardValue + " " + suitCard;
                list.add(card);
            }
        }

    }
    private static void findAndRemoveRandomCard(Set<String> list) {
        Random random = new Random();
        int b = list.size();
        int a = random.nextInt(b);
//        System.out.println(list.get(a));
        list.remove(a);
    }
}
