import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CreateFile {

    public static void main(String[] args) {

        try {
            String workingDirectory = System.getProperty("user.dir");
            String file = workingDirectory + "\\data.txt";
            Path path = Paths.get(file);
            Files.writeString(path, "Kurs\nJava\nLekcja 6\nPliki\nWyjątki\nPliki\nKoniec pliku", StandardOpenOption.CREATE_NEW);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}