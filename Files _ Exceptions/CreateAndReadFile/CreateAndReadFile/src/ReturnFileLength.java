import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReturnFileLength {

    public static void main(String[] args) {

        try {
            String workingDirectory = System.getProperty("user.dir");
            String file = workingDirectory + "\\data.txt";
            Path path = Paths.get(file);
            String fileContent = Files.readString(path);
            System.out.println(fileContent.length());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
