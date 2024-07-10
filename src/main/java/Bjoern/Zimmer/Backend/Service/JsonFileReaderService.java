package Bjoern.Zimmer.Backend.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;

@Service
public class JsonFileReaderService {

    public String readJsonFile(String language) throws IOException {
        String fileName = "src/main/resources/i18n/" + language + ".json";
        byte[] jsonData = Files.readAllBytes(Paths.get(fileName));
        return new String(jsonData, StandardCharsets.UTF_8);
    }
}
