package interfaces;

import models.PlayerImpl;

public interface GameBJ {

    void addPlayerInGame(PlayerImpl player); //добавить игрока

    void giveTwoCardsOnHands(); //раздать 2 карты на старте

    void giveOneCardToPlayerIfNeed(); //дать дополнительную карту

    void printWinner(); //объявить победителя
}
