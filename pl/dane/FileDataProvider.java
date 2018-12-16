package pl.dane;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDataProvider implements DataProvider {
    @Override
    public String getData() {
        try {
            return new String(Files.readAllBytes(Paths.get("src/Data.txt")));
        } catch (IOException e) {
            System.out.println("błąd: " + e.getMessage());
        }

        return "Błędne dane!";
    }
}
