package Games.CardGames;

import java.util.*;

public class Deck {
    private List<Card> cards = new ArrayList<>();
    private List<Card> removedCards = new ArrayList<>();

    public Deck() {
        this.initialise();
    }

    private void initialise() {
        EnumSet.allOf(Card.Suit.class)
            .forEach(suit -> EnumSet.allOf(Card.Rank.class).forEach(rank -> cards.add(new Card(suit, rank))));
    }

    public int cardsLeft() {
        return this.cards.size();
    }

    public Card draw() {
        Card card = cards.get(0);

        this.cards.remove(card);
        this.removedCards.add(card);

        return card;
    }

    public void shuffle(int times) {
        for (int i = 0; i < times; ++i) {
            Collections.shuffle(cards);
        }
    }
}
