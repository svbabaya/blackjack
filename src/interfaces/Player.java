package interfaces;

import models.CardImpl;

public interface Player {

    void takeCard (CardImpl card); //взять карту из колоды

    int countValuesOfAllCardsOnHands(); //количество карт на руках

    boolean needCard(); //нужна еще одна карта или нет

    void showCardsOnHands(); //показать карты


}
