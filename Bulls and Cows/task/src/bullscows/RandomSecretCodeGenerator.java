package bullscows;

import java.util.*;
import java.util.stream.Collectors;

public class RandomSecretCodeGenerator {
    public List<String> alphabet = new ArrayList<>();


    public String getRandomDigitalString(int inputCodeLength, int inputNumberPossibleSymbol){
        List<String> alphabetAndNumbersList = new ArrayList<>();
        for (int i = 0; i<10;i++){
            alphabetAndNumbersList.add(String.valueOf(i));
        }

        for (char i = 'a'; i <= 'z'; i++){
            alphabetAndNumbersList.add(String.valueOf(i));
        }

        List<String> convertToString = alphabetAndNumbersList.stream()
                .limit(inputNumberPossibleSymbol)
                .collect(Collectors.toList());

        alphabet.addAll(convertToString);

        Collections.shuffle(convertToString);

        return convertToString.stream()
                .limit(inputCodeLength)
                .map(Objects::toString)
                .collect(Collectors.joining(""));
    }
}