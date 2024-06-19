package com.alena;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String again = "";
        Game game = new Game();

        do {
            game.initGame();
            System.out.println("Выбирите дверь (Число от 1 до 3): ");

            int firstSelectedDoor = scanner.nextInt();
            if (game.chooseDoor(firstSelectedDoor)){


                    int hintDoor = game.giveHint();
                System.out.println("Ведущий открывает дверь №"+ (hintDoor+1)+". Хотите ли поменять выбор? Y/N");
                String changeChoice = scanner.next();
                if (changeChoice.equalsIgnoreCase("Y")){
                    game.changeChoice();
                }
                game.openSelectedDoor();


            } else {
                System.out.println("Такой двери нет!");

            }
            System.out.println("Хотите сыграть еще раз? Y/N");
            again = scanner.next();

        } while (again.equalsIgnoreCase("Y"));

    }
}