package anagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagrams {

    private final List<String> dictionary;

    public Anagrams(List<String> dictionary) {
        this.dictionary = dictionary;
    }

    public static void main(String[] args) {

        //read dictionary file
        List<String> dictionary = new WordList().read("wordlist.txt");

        Anagrams anagrams = new Anagrams(dictionary);
        anagrams.findAnagramsOf("races");
    }


    public List<String> findAnagramsOf(String word){
        // implement me
        return Collections.emptyList();
    }


}
