# Programming Exercise - Finding Anagrams 

## Objective:

> Write a program to find all anagrams of the word **'acres'** in the dictionary file provided. Anagrams are different words that contain exactly the same letters, for example 'lane' and 'lean' are anagrams of 'elan'.

## Details

> The dictionary file `resources/wordlist.txt` contains a list of english words of varying length (between 3 and 10 characters long) in alphabetical order. Take a look at the file to see what's in there. There are two classes: WordList (which reads the dictionary file into a List of Strings) and Anagrams (which you can play around with and write some code to find anagrams in the dictionary).

> **See if you can write a program find and print out all anagrams of the word: _acres_**

> The purpose of the exercise to find out about the problem domain (in this case looking for specific words in the dictionary) and see if you can come up with a solution for the above, there's no right or wrong way to approach it. 

> If you complete that, see if you can:
- find the longest list of 4 letter anagrams in the dictionary file
- find the longest list of anagrams in the dictionary file (of any word length)
- what can you find out about anagram distribution/occurrence in relation to word length?

## Building/Coding

> This a basic java project whose only dependency is junit (for unit tests, but only needed if you want to write some - the emphasis here is on problem solving and approach to work, we think TDD is great, but if you've never done TDD before or don't want to use TDD that's OK - we would like you to write some tests though!). A maven POM is included that declares dependencies for Junit and Mockito.
## Testing

> There are two tests (junit) one for WordList (which you don't need to do anything with) and one for Anagrams which you can write tests in (again, you don't have to write tests, but we do like the TDD approach). Both tests can be found in `src/test` and can be run via your IDE or via maven (mvn test).

## Running

> The Anagrams class has a main method and so can be run through the IDE or from the command line.
