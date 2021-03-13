import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadAndSaveWithUpperCase {

    public static void main(String[] args) {

        try {
            String workingDirectory = System.getProperty("user.dir");
            String file = workingDirectory + "\\data.txt";
            Path path = Paths.get(file);
            String fileContent = Files.readString(path);
            fileContent = fileContent.toUpperCase();
            String outFile = workingDirectory + "\\output.txt";
            Path outPath = Paths.get(outFile);
            Files.writeString(outPath, fileContent, StandardOpenOption.CREATE_NEW);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}