package anagram;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordListTest {

    private WordList testSubject;


    @Before
    public void setUp(){
        testSubject = new WordList();
    }


    @Test
    public void readShouldReturnAllWordsFromFile(){
        //given
        String dictionaryFileName = "wordlist.races.txt";

        //when
        List<String> words = testSubject.read(dictionaryFileName);

        //then
        assertEquals(words.size(),248000);

    }
}
