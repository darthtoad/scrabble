package models;
import java.util.List;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Map;
import java.util.HashMap;

public class ScrabbleTest {
    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 1;
        assertEquals(expected, testScrabble.calculateScore("a"));
    }

    @Test
    public void calculateScore_returnsScoreForMultipleLetters_15() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 15;
        assertEquals(expected, testScrabble.calculateScore("zaps"));
    }
}