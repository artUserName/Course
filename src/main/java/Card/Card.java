package Card;

public class Card {
    public String suit;
    public String value;

    public String setSuit() {
        this.suit = String.valueOf(suitCard.Hearts);
        return suit;
    }

    public String setValue() {
        this.value = String.valueOf(cardValue.Ace);
        return value;
    }

    public void getCardValues(){
        suit=setSuit();
        value=setValue();
        System.out.println(suit+" "+value);
        System.out.println(setSuit()+" "+setValue());
    }

    public Card() {


    }
}
