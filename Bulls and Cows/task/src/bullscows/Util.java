package bullscows;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Util {
    static List<Integer> numberToDigits(int number) {


        List<Integer> listOfDigits = Arrays.stream(String.valueOf(number).split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        return listOfDigits;
    }
}
