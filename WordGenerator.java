import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordGenerator {
    private ArrayList<String> words;
    private Random rand;
    private void fillArrayList(){
        words.addAll(List.of("boolean","break", "byte", "case", "char", "class", "continue",
                "do", "double", "else", "enum", "for", "if", "import","int"));
    }

    private String generateWord(){
        int i = rand.nextInt(words.size());
        return words.get(i);
    }

    private void addWord(String word){
        words.add(word);
    }
}
