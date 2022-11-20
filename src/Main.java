import models.CroupierBJ;
import models.GameBJImpl;
import models.PlayerImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String playAgain = "";
        Scanner scan = new Scanner(System.in);
        //1 Создать класс игры
        //2 Создать игроков
        //3 Создать крупье
        //4 Добавить игроков и крупье в игру
        //5 Добавить колоду карт
        //6 Добавить карты в колоду
        //7 Раздать каждому игроку по 2 карты на старте
        //8 Раздавать каждому игроку по 1 карте пока это требуется
        //9 Определить победителя

        //1. Создание игры

        do {
            GameBJImpl gameBJ = new GameBJImpl();

            //2. Создание и добавление игроков
            String addNewPlayer = "да";
            while (addNewPlayer.equalsIgnoreCase("да")) {
                System.out.println("Введите имя игрока:");
                PlayerImpl player = new PlayerImpl(scan.nextLine());
                gameBJ.addPlayerInGame(player);
                System.out.println("Добавить игрока? да/нет");
                addNewPlayer = scan.nextLine();
            }

            //3. Создание и добавление крупье
            CroupierBJ croupier = new CroupierBJ();
            gameBJ.addPlayerInGame(croupier);

            //5. Добавление колоды карт
            //6. Добавление карт в колоду

            //7. Раздать каждому игроку по 2 карты на старте
            gameBJ.giveTwoCardsOnHands();
            //8. Раздать каждому игроку по 1 карте пока это требуется
            gameBJ.giveOneCardToPlayerIfNeed();
            //9. Определить победителя
            gameBJ.printWinner();

            System.out.println("\nИграть еще раз? да/нет");
            playAgain = scan.nextLine();
        } while (playAgain.equalsIgnoreCase("да"));
        System.out.println("Игра окончена!\n");
    }
}