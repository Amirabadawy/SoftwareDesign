package org.readSystem.jsonRead;

import com.fasterxml.jackson.databind.JsonNode;

import static org.readSystem.jsonRead.JsonReader.getJsonValue;
import static org.readSystem.jsonRead.JsonReader.readJsonFile;

public class MainJsonReader {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Amira\\IdeaProjects\\Software-Design\\src\\test\\resources\\menu.json"; // Provide the path to your JSON file

        JsonNode jsonNode = readJsonFile(filePath);

        if (jsonNode != null) {
            String value = getJsonValue(jsonNode, "menu");
            if (value != null) {
                System.out.println("Value: " + value);
            } else {
                System.out.println("Key not found or value is null.");
            }
        } else {
            System.out.println("Failed to read JSON file.");
        }
    }
}
