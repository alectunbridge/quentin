# Graduate Pair Programming Exercise - Anagrams 

## Objective:

> Write a program to find one word anagrams in the dictionary file provided. Anagrams are different words that contain exactly the same letters, for example 'lane' and 'lean' are anagrams of 'elan'.

## Details

> The dictionary file `resources/wordlist.txt` contains a list of english words of varying length (between 3 and 10 characters long) in alaphabetical order. Take a look at the file to see what's in there. There are two classes: WordList (which reads the dictionary file into a List of words) and Anagrams (which you can play around with and hopefully write some code to find anagrams in the dictionary).

> **See if you can help write a program find and print out all anagrams of the word: _races_**

> The purpose of the exercise to find out about the problem domain (in this case looking for specific words in the dictionary) and see if you can come up with a solution for the above, there's no right or wrong way to approach it. 

> If you get through that, how about:
- finding the longest list of 4 letter anagrams in the dictionary
- finding the longest list of anagrams in the dictionary of any word length
- what can you find out about anagram distribution/occurrence in relation to word length?

## Building

> This a basic java project whose only dependency is junit (for unit testsm but only needed if you want to write some). To keep it simple there is no build tool (gradle/maven etc).

## Testing

> There is currently a single test (junit), which can be found in `src/test/java`, and can be run via your IDE of choice.

## Running

> The Anagrams class has a main method and so can be run through the IDE or from the command line.