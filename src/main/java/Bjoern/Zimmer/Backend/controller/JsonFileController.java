package Bjoern.Zimmer.Backend.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Bjoern.Zimmer.Backend.Service.JsonFileReaderService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class JsonFileController {

    private final JsonFileReaderService jsonFileReaderService;

    @Autowired
    public JsonFileController(JsonFileReaderService jsonFileReaderService) {
        this.jsonFileReaderService = jsonFileReaderService;
    }

    @GetMapping("/language-data")
    public String getJsonData(@RequestParam(defaultValue = "de") String lang) throws IOException {
        return jsonFileReaderService.readJsonFile(lang);
    }
} 