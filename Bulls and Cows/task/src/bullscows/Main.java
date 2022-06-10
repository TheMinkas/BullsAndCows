package bullscows;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Бык - если пользователь угадывает цифру и её расположение
        //Корова - если пользователь угадывает только цифру, но не её расположение


        Scanner scanner = new Scanner(System.in);
        int inputCodeLength = 0;
        int inputNumberPossibleSymbol = 0;

        //Блок проверок
        try {
            System.out.println("Please, enter the secret code's length: ");
            inputCodeLength = scanner.nextInt();
            System.out.println("Input the number of possible symbols in the code:");
            inputNumberPossibleSymbol = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("error");
        }

        if (inputNumberPossibleSymbol == 0) {
            System.out.println("error");
            System.exit(0);
        } if (inputCodeLength == 0) {
            System.out.println("error");
            System.exit(0);
        } if (inputNumberPossibleSymbol < inputCodeLength) {
            System.out.println("error");
            System.exit(0);
        } if (inputNumberPossibleSymbol > 36) {
            System.out.println("error");
            System.exit(0);
        }

        //Старт игры
        RandomSecretCodeGenerator randomSecretCodeGenerator = new RandomSecretCodeGenerator();
        Grader grader = new Grader(randomSecretCodeGenerator
                .getRandomDigitalString(inputCodeLength, inputNumberPossibleSymbol));
        System.out.println("The secret is prepared: "
                + grader.getSecretCode().replaceAll(".", "*")
                + " " + Mapper.map(randomSecretCodeGenerator.alphabet));
        System.out.println("Okay, let's start a game!");


        //Счётчик попыток
        int turn = 1;

        //Цикл выполняется до тех пор, пока не будет угадано число
        while (true) {
            System.out.println("Turn " + turn + ":");
            grader.compare();
            turn++;
        }
    }
}