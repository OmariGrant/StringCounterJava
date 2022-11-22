package org.example;

public class WordCounter {
    public int countWords(String[] words, char c){
        int count = 0;
        for (String word: words) {
            word = word.toUpperCase();
            if (word.startsWith(String.valueOf(c).toUpperCase())){
                count++;
            }

        }
        return count;
    }

    public int countWordsInString(String phrase, char c){
        int count = 0;

        String[] words = phrase.split(" ");

        for (String word: words) {
            word = word.toUpperCase();
            if (word.startsWith(String.valueOf(c).toUpperCase())) {
                count++;
            }
        }


        return count;
    }

}
