package anagram;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class AnagramsTest {

private Anagrams testSubject;

    @Before
    public void setUp(){
        List<String> dictionary = new WordList().read("wordlist.full.txt");
        testSubject=new Anagrams(dictionary);
    }

    @Test
    public void shouldFindAnagrams(){
        List<String> anagrams = testSubject.findAnagramsOf("acres");
        assertThat(anagrams).contains("cares", "acres");
        System.out.println(anagrams);
    }

}
