package anagram;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AnagramsTest {

private Anagrams testSubject;

    @Before
    public void setUp(){
        List<String> dictionary = new WordList().read("wordlist.txt");
        testSubject=new Anagrams(dictionary);
    }

    @Test
    public void shouldFindAnagrams(){
        testSubject.findAnagramsOf("races");
    }

}
