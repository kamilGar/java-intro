import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SearchForWord {

    public static void main(String[] args) {

        try {
            String workingDirectory = System.getProperty("user.dir");
            String file = workingDirectory + "\\data.txt";
            Path path = Paths.get(file);
            String fileContent = Files.readString(path);
            String[] result = fileContent.split("\n");

            String word = "Java";
            String word2 = "Future";
            System.out.println(SearchForWord.findWord(word,result));
            System.out.println(SearchForWord.findWord(word2,result));

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String findWord(String word, String[] text) {
        String result = "";
        for (int i=0; i<text.length; i++)
            if (text[i].equalsIgnoreCase(word)) {
                result = "Text contains '"+ word + "' in line: "+(i+1);
                break;
            } else if (i == text.length - 1){
                result = "Text do not contains '"+ word +"'";
            }
        return result;
    }

}