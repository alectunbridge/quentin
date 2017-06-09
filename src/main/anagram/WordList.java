package anagram;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WordList {

    public List<String> read(String fileName) {
        final List<String> words = new ArrayList<>();
        try {
            URL url = this.getClass().getClassLoader().getResource(fileName);
            Path filePath = Paths.get(url.toURI());
            words.addAll(Files.readAllLines(filePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return words;
    }
}
