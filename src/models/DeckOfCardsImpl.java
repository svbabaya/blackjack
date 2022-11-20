package models;

import interfaces.DeckOfCards;

import java.util.concurrent.ThreadLocalRandom;

public class DeckOfCardsImpl implements DeckOfCards {

    //fields
    CardImpl[] cards = new CardImpl[52];

    //constructor
    public DeckOfCardsImpl() {
        cards[0] = new CardImpl("Двойка Трефа", 2);
        cards[1] = new CardImpl("Двойка Черви", 2);
        cards[2] = new CardImpl("Двойка Бубны", 2);
        cards[3] = new CardImpl("Двойка Пики", 2);

        cards[4] = new CardImpl("Тройка Трефа", 3);
        cards[5] = new CardImpl("Тройка Черви", 3);
        cards[6] = new CardImpl("Тройка Бубны", 3);
        cards[7] = new CardImpl("Тройка Пики", 3);

        cards[8] = new CardImpl("Четверка Трефа", 4);
        cards[9] = new CardImpl("Четверка Черви", 4);
        cards[10] = new CardImpl("Четверка Бубны", 4);
        cards[11] = new CardImpl("Четверка Пики", 4);

        cards[12] = new CardImpl("Пятерка Трефа", 5);
        cards[13] = new CardImpl("Пятерка Черви", 5);
        cards[14] = new CardImpl("Пятерка Бубны", 5);
        cards[15] = new CardImpl("Пятерка Пики", 5);

        cards[16] = new CardImpl("Шестерка Трефа", 6);
        cards[17] = new CardImpl("Шестерка Черви", 6);
        cards[18] = new CardImpl("Шестерка Бубны", 6);
        cards[19] = new CardImpl("Шестерка Пики", 6);

        cards[20] = new CardImpl("Семерка Трефа", 7);
        cards[21] = new CardImpl("Семерка Черви", 7);
        cards[22] = new CardImpl("Семерка Бубны", 7);
        cards[23] = new CardImpl("Семерка Пики", 7);

        cards[24] = new CardImpl("Восьмерка Трефа", 8);
        cards[25] = new CardImpl("Восьмерка Черви", 8);
        cards[26] = new CardImpl("Восьмерка Бубны", 8);
        cards[27] = new CardImpl("Восьмерка Пики", 8);

        cards[28] = new CardImpl("Девятка Трефа", 9);
        cards[29] = new CardImpl("Девятка Черви", 9);
        cards[30] = new CardImpl("Девятка Бубны", 9);
        cards[31] = new CardImpl("Девятка Пики", 9);

        cards[32] = new CardImpl("Десятка Трефа", 10);
        cards[33] = new CardImpl("Десятка Черви", 10);
        cards[34] = new CardImpl("Десятка Бубны", 10);
        cards[35] = new CardImpl("Десятка Пики", 10);

        cards[36] = new CardImpl("Валет Трефа", 10);
        cards[37] = new CardImpl("Валет Черви", 10);
        cards[38] = new CardImpl("Валет Бубны", 10);
        cards[39] = new CardImpl("Валет Пики", 10);

        cards[40] = new CardImpl("Дама Трефа", 10);
        cards[41] = new CardImpl("Дама Черви", 10);
        cards[42] = new CardImpl("Дама Бубны", 10);
        cards[43] = new CardImpl("Дама Пики", 10);

        cards[44] = new CardImpl("Король Трефа", 10);
        cards[45] = new CardImpl("Король Черви", 10);
        cards[46] = new CardImpl("Король Бубны", 10);
        cards[47] = new CardImpl("Король Пики", 10);

        cards[48] = new CardImpl("Туз Трефа", 11);
        cards[49] = new CardImpl("Туз Черви", 11);
        cards[50] = new CardImpl("Туз Бубны", 11);
        cards[51] = new CardImpl("Туз Пики", 11);
    }
    //methods
    @Override
    public CardImpl randomCard() {
        int randomIndex = ThreadLocalRandom.current().nextInt(0, 51);
        return cards[randomIndex];
    }
}
