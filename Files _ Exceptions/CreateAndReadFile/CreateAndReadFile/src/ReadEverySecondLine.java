import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadEverySecondLine {

    public static void main(String[] args) {

        try {

            String workingDirectory = System.getProperty("user.dir");
            String file = workingDirectory + "\\data.txt";
            Path path = Paths.get(file);
            String fileContent = Files.readString(path);
            String[] result = fileContent.split("\n");
            for (int i=0; i<result.length; i+=2)
                System.out.println(result[i]);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}