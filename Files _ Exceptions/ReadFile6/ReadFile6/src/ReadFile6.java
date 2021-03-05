import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile6 {

    public static void main(String[] args) {

        try {

            Path path = Paths.get("D:\\Users\\IdeaProjects2\\data.txt");
            String fileContent = Files.readString(path);
            String[] result = fileContent.split("\n");

            String word = "Java";
            String word2 = "ekcja";
            System.out.println(ReadFile6.findWord(word,result));
            System.out.println(ReadFile6.findWord(word2,result));

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String findWord(String word, String[] text) {
        String result = "";
        for (int i=0; i<text.length; i++)
            if (text[i].equalsIgnoreCase(word)) {
                result = "Tekst zawiera słowo '"+ word + "' (linia: "+(i+1)+")";
                break;
            } else if (i == text.length - 1){
                result = "Tekst nie zawiera słowa '"+ word +"'";
            }
        return result;
    }

}