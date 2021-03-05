import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile4 {

    public static void main(String[] args) {

        try {

            Path path = Paths.get("D:\\Users\\IdeaProjects2\\data.txt");
            String fileContent = Files.readString(path);
            String[] result = fileContent.split("\n");
            for (int i=0; i<result.length; i++)
                System.out.println(result[(result.length-i)-1]);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


