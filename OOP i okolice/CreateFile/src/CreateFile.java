import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CreateFile {

    public static void main(String[] args) {

        try {

            Path path = Paths.get("D:\\Users\\IdeaProjects2\\data.txt");
            Files.writeString(path, "Kurs\nJava\nLekcja 6\nPliki\nWyjątki\nPliki\nKoniec pliku", StandardOpenOption.CREATE_NEW);
            String fileContent = Files.readString(path);
            System.out.println(fileContent);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}