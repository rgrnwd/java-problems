package Games.CardGames;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    void deck_constructor_should_initialise_with_52_cards() {
        Deck deck = new Deck();
        assertEquals(52, deck.cardsLeft());
    }

    @Test
    void deck_draw_should_return_the_top_card() {
        Deck deck = new Deck();
        assertEquals("Two of Hearts", deck.draw().describe());
    }

    @Test
    void deck_draw_should_discard_drawn_card() {
        Deck deck = new Deck();
        assertEquals("Two of Hearts", deck.draw().describe());
        assertEquals("Three of Hearts", deck.draw().describe());
    }
    @Test
    void deck_shuffle_should_randomly_reorder_deck() {
        Deck deck = new Deck();
        deck.shuffle(10);
        // checking just the first card would fail 1/52 times, checking both should fail only 0.00036~ times
        assertTrue("Two of Hearts" != deck.draw().describe() && "Three of Hearts" != deck.draw().describe());
    }

}