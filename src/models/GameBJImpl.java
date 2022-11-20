package models;

import interfaces.GameBJ;

public class GameBJImpl implements GameBJ {

    PlayerImpl[] playersInGame = new PlayerImpl[10];
    DeckOfCardsImpl deckOfCardsOnHands = new DeckOfCardsImpl();

    //добавить игрока
    @Override
    public void addPlayerInGame(PlayerImpl player) {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] == null) {
                playersInGame[i] = player;
                break;
            }
        }
    }

    //раздать 2 карты на старте
    @Override
    public void giveTwoCardsOnHands() {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] != null) {
                playersInGame[i].takeCard(deckOfCardsOnHands.randomCard());
                playersInGame[i].takeCard(deckOfCardsOnHands.randomCard());
            }
        }
    }

    //дать дополнительную карту
    @Override
    public void giveOneCardToPlayerIfNeed() {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] != null)
                while (playersInGame[i].needCard()) playersInGame[i].takeCard(deckOfCardsOnHands.randomCard());
        }
    }

    //объявить победителя
    @Override
    public void printWinner() {

        //1. Исключение игроков с value > 21
        for (PlayerImpl player : playersInGame) {
            if (player != null) {
                if (player.countValuesOfAllCardsOnHands() > 21) player.setOutOfGame(true);

            }
        }

        //2. Победил игрок, оставшийся в игре
        if (countPlayersInGame() == 1) {
            for (PlayerImpl player : playersInGame) {
                if (player != null && !player.isOutOfGame()) {
                    System.out.print("\nПобедил игрок, оставшийся в игре: ");
                    System.out.println(player.getNameOfPlayer());
                    player.showCardsOnHands();
                }
            }
        }

        //3. Победило несколько игроков, найти лучшего
        int bestValue = 0;
        for (PlayerImpl player : playersInGame) {
            if (player != null && !player.isOutOfGame()) {
                if (player.countValuesOfAllCardsOnHands() > bestValue)
                    bestValue = player.countValuesOfAllCardsOnHands();
            }
        }

        //4. Выиграл крупье
        System.out.println("\nВыиграл крупье");
        for (PlayerImpl player : playersInGame) {
            if (player != null && !player.isOutOfGame() && !player.isCroupier()) {
                System.out.println(player.getNameOfPlayer());
                player.showCardsOnHands();
            }
        }
    }

    //Пересчитать всех игроков в игре
    public int countPlayersInGame() {
        int count = 0;
        for (PlayerImpl player : playersInGame)
            if (player != null && !player.isOutOfGame() && !player.isCroupier()) count++;
        return count;
    }
}
