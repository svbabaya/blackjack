package models;

import interfaces.Card;
import interfaces.Player;

import java.util.Scanner;

public class PlayerImpl implements Player {

    private String nameOfPlayer;

    public String getNameOfPlayer() {
        return nameOfPlayer;
    }

    public void setNameOfPlayer(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
    }

    CardImpl[] cardsOnHands = new CardImpl[100];
    private boolean outOfGame;
    private boolean isCroupier;

    public boolean isCroupier() {
        return isCroupier;
    }

    public void setCroupier(boolean croupier) {
        isCroupier = croupier;
    }

    public boolean isOutOfGame() {
        return outOfGame;
    }

    public void setOutOfGame(boolean outOfGame) {
        this.outOfGame = outOfGame;
    }

    public PlayerImpl(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
    }
    public PlayerImpl() {

    }

    //взять карту из колоды
    @Override
    public void takeCard(CardImpl card) {
        for (int i = 0; i < cardsOnHands.length; i++) {
            if (cardsOnHands[i] == null) {
                cardsOnHands[i] = card;
                break;
            }
        }
    }

    //количество карт на руках
    @Override
    public int countValuesOfAllCardsOnHands() {
        int countValues = 0;
        for (CardImpl card : cardsOnHands) {
            if (card != null) {
                countValues += card.getValue();
            }
        }
        return countValues;
    }

    //нужна еще одна карта или нет
    @Override
    public boolean needCard() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print(nameOfPlayer);
        System.out.println(" ----- ваши карты -----");
        showCardsOnHands();
        System.out.println("Еще оду карту? да/нет:");
        return scan.nextLine().equalsIgnoreCase("да");
    }

    //отобразить карты на руках
    @Override
    public void showCardsOnHands() {
        for (CardImpl card : cardsOnHands) {
            if (card != null) {
                card.printCard();
                System.out.println(" " + card.getValue());
            }
        }
    }
}
