package bullscows;

import java.util.List;
import java.util.Scanner;

public class Grader {
    Scanner scanner = new Scanner(System.in);
    private String secretCode;


    public Grader(String secretCode) {
        this.secretCode = secretCode;
    }

    public String getSecretCode() {
        return secretCode;
    }



    public void compare (){

        List<String> listInputValue = List.of(scanner.nextLine().split(""));
        List<String> secretNumberCode = List.of(secretCode.split(""));

        //Бык - если пользователь угадывает цифру и её расположение
        //Корова - если пользователь угадывает только цифру, но не её расположение

        int bulls = 0;
        int cows = 0;

        //Сравнение по символьно для того, чтобы можно было понять сколько символов было угадано,
        // и нахадились ли они в нужной ячейке

        for (int i = 0; i < secretNumberCode.size(); i++) {
            if (listInputValue.get(i).equals(secretNumberCode.get(i))) {
                bulls++;
            } else if (secretNumberCode.contains(listInputValue.get(i))) {
                cows++;
            }
        }

        //Вывод результата
        //Если ты угадал все символы, то ты победил
        if (bulls == secretNumberCode.size()) {   //Only bulls
            System.out.printf("Grade: %d bull(s).\n", bulls);
            System.out.println("Congratulations! You guessed the secret code.\n");
            System.exit(0);
        }
        //Если количество угаданых bulls больше 0, а cows = 0, то попробуй ещё раз
        else if (bulls > 0 && cows == 0) {
            System.out.printf("Grade: %d bull(s).\n", bulls);
        }
        //Если количество угаданых cows больше 0, а bulls = 0, то попробуй ещё раз
        else if (cows > 0 && bulls == 0) {    //Only cows
            System.out.printf("Grade: %d cows(s).\n", cows);
        }
        //Если количество угаданых cows больше 0 и bulls > 0, то попробуй ещё раз
        else if (cows > 0 && bulls > 0) {     //Both
            System.out.printf("Grade: %d bull(s) and %d cow(s).\n", bulls, cows);
        }
        //Если количество угаданых bulls и cows = 0
        else {    //None
            System.out.printf("Grade: None.\n");
        }
    }
}
