package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {

    @org.junit.jupiter.api.Test
    void countWords() {
        String[] words = {"The", "cat", "in", "the", "hat"};
        WordCounter wordCounter = new WordCounter();
        assertEquals(wordCounter.countWords(words, 't'), 2);
    }
}