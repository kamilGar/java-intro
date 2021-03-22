import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReverseFileText {

    public static void main(String[] args) {

        try {
            String workingDirectory = System.getProperty("user.dir");
            String file = workingDirectory + "\\data.txt";
            Path path = Paths.get(file);
            String fileContent = Files.readString(path);
            String[] result = fileContent.split("\n");
            for (int i=0; i<result.length; i++)
                System.out.println(result[(result.length-i)-1]);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


