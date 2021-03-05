import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadFile5 {

    public static void main(String[] args) {

        try {

            Path path = Paths.get("D:\\Users\\IdeaProjects2\\data.txt");
            String fileContent = Files.readString(path);
            fileContent = fileContent.toUpperCase();
            Path path2 = Paths.get("D:\\Users\\IdeaProjects2\\output.txt");
            Files.writeString(path2, fileContent, StandardOpenOption.CREATE_NEW);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}