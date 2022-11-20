package models;

public class CroupierBJ extends PlayerImpl {

    @Override
    public boolean needCard() {
        return countValuesOfAllCardsOnHands() <= 17;
    }

    public CroupierBJ() {
        setNameOfPlayer("Croupier");
        setCroupier(true);
    }
}
