package models;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Scrabble {
    Map<Character, Integer> letterScores = new HashMap<Character, Integer>();
    letterScores.put("a", 1);
    letterScores.put("b", 3)
    letterScores.put("c", 3);
    letterScores.put("d", 2);
    letterScores.put("e", 1);
    letterScores.put("f", 4);
    letterScores.put("g", 2);
    letterScores.put("h", 4);
    letterScores.put("i", 1);
    letterScores.put("j", 8);
    letterScores.put("k", 5);
    letterScores.put("l", 1);
    letterScores.put("m", 3);
    letterScores.put("n", 1);
    letterScores.put("o", 1);
    letterScores.put("p", 3);
    letterScores.put("q", 10);
    letterScores.put("r", 1);
    letterScores.put("s", 1);
    letterScores.put("t", 1);
    letterScores.put("u", 1);
    letterScores.put("v", 4);
    letterScores.put("w", 4);
    letterScores.put("x", 8);
    letterScores.put("y", 4);
    letterScores.put("z", 10);

    public Integer calculateScore(String input) {
        input.toLowerCase().split("//g");

    }
}
