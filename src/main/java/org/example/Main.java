package org.example;

public class Main {
    public static void main(String[] args) {

        String[] words = {"The", "cat", "in", "the", "hat"};
        String phrase = "The cat in the hat";
        WordCounter wordCounter = new WordCounter();


        System.out.println("Display the result from the phrase: The cat in the hat");
        //count words from array
        System.out.println(wordCounter.countWords(words, 't'));

        //count words from phrase
        System.out.println(wordCounter.countWordsInString(phrase, 't'));
        System.out.println(wordCounter.countWords(phrase.split(" "), 't'));

    }
}