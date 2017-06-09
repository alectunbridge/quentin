package anagram;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnagramsTest {

private Anagrams testSubject;

    @Before
    public void setUp(){
        List<String> dictionary = new WordList().read("wordlist.races.txt");
        testSubject=new Anagrams(dictionary);
    }

    @Test
    public void shouldFindAnagrams(){
        assertEquals(testSubject.findAnagramsOf("races").get(0), "cares");
    }

}
