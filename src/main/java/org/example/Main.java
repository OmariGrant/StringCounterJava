package org.example;

public class Main {
    public static void main(String[] args) {

        String[] words = {"The", "cat", "in", "the", "hat"};
        String phrase = "The cat in the hat";
        WordCounter wordCounter = new WordCounter();


        System.out.println(wordCounter.countWords(words, 't'));
        System.out.println(wordCounter.countWords(phrase.split(" "), 't'));

    }
}