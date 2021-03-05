import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {

    public static void main(String[] args) {

        try {

            Path path = Paths.get("D:\\Users\\IdeaProjects2\\data.txt");
            String fileContent = Files.readString(path);
            System.out.println(fileContent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
