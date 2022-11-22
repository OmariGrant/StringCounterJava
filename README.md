## String starting with character

### Task 1
Count words which start with... Create and test a method countWords which:

has two input parameters:
- an array of Strings
- a character

returns an integer - the number of strings in the array that start with the given character (regardless of case)

For example, given the array

String[] words = {"The", "cat", "in", "the", "hat"};
countWords(words, 't')

would return 2;

### Task 2
Count words in a string Create and test a method countWordsInString which

has two input parameters:
a single String, a character

returns an integer - the number of words in the String that start with the given character (regardless of case)

For example, given the string

String phrase = "The cat in the hat";
countWordsInString(phrase, 't')

would return 2;

NOTE countWordsInString can call the countWords method you made earlier.

