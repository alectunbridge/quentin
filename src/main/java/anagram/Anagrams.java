package anagram;

import java.util.ArrayList;
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
        anagrams.findAnagramsOf("acres");
    }


    public List<String> findAnagramsOf(String word) {
        List<String> listOfAnagrams = new ArrayList<>();
        for (int i = 0; i < dictionary.size(); i++) {
            if (word.length() == dictionary.get(i).length()) {
                if (isAnagram2(dictionary.get(i), word)) {
                    listOfAnagrams.add(dictionary.get(i));
                }
            }
        }
        return listOfAnagrams;
    }

    private boolean isAnagram2(String s, String word) {
        boolean[] listOfBooleans = new boolean[word.length()];
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            int position = findNextInstance(character, s, listOfBooleans);

            if (position != -1) {
                listOfBooleans[position] = true;
            }
        }
        for (boolean b : listOfBooleans) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    private int findNextInstance(char c, String word, boolean[] listOfBooleans) {
        int result = -1;
        for (int i = 0; i < word.length() && result == -1; i++) {
            if (word.charAt(i) == c && !listOfBooleans[i]) {
                result = i;
            }
        }
        return result;
    }
}
