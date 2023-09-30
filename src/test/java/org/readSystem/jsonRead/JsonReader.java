package org.readSystem.jsonRead;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JsonReader {
    public static JsonNode readJsonFile(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = null;

        try {
            jsonNode = objectMapper.readTree(new File(filePath));
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonNode;
    }

    public static String getJsonValue(JsonNode jsonNode, String key) {
        if (jsonNode != null && jsonNode.has(key)) {
            return jsonNode.get(key).asText();
        } else {
            return null;
        }
    }

}
