package bullscows;

import java.util.List;

public class Mapper {
    //Передаю на вход массив.
    //Если приходит > 10 символов, то я передаю от 0 до последнего
    //Если приходит < 10 символов, то я передаю от 0 до 9 + буквы от a до последней буквы

    public static String map(List<String> alphabet) {
        if (alphabet.size() <= 10) {
            return 0 + "-" + (alphabet.size()-1) ;
        } else{
            return "(" + 0 + "-" + 9 + ", " + "a" + "-" + alphabet.get(alphabet.size()-1) + ")";
        }
    }
}