package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Given the example in the requirements, return 2 from the given phrase.")
    void GivenCatInHatArray_Return2withCharacterT() {
        String[] words = {"The", "cat", "in", "the", "hat"};
        WordCounter wordCounter = new WordCounter();
        assertEquals(wordCounter.countWords(words, 't'), 2);
    }

    @ParameterizedTest
    @ValueSource(strings = {"testing testing 123,", "the cat in the hat", "The Cat In The Hat", "T1 ttttttt"})
    @DisplayName("Given a string which contains 2 words starting with t, return 2")
    void testCountWords_GivenAStringWith2WordsStartingT_Return2(String phrase) {
        WordCounter wordCounter = new WordCounter();
        int resultT = wordCounter.countWords(phrase.split(" "), 't');
        int resultT1 = wordCounter.countWords(phrase.split(" "), 'T');
        assertEquals(2, resultT);
        assertEquals(2, resultT1);

    }

    @ParameterizedTest
    @ValueSource(strings = {"testing testing 123,", "the cat in the hat", "The Cat In The Hat", "T1 ttttttt"})
    @DisplayName("Given a string which contains 2 words starting with t, return 2")
    void testCountWordsInString_GivenAStringWith2WordsStartingT_Return2(String phrase) {
        WordCounter wordCounter = new WordCounter();
        int resultT = wordCounter.countWordsInString(phrase, 't');
        int resultT1 = wordCounter.countWordsInString(phrase, 'T');
        assertEquals(2, resultT);
        assertEquals(2, resultT1);

    }


}