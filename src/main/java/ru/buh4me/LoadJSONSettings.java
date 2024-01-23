package ru.buh4me;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LoadJSONSettings {
    private String server1cConfigFile;

    public static String getConfigFile(String Config) {

        /*switch (Config) {
            case "SERVERSQL" -> {
                return "server_sql_config.json";
            }
            case "SERVER1C" -> {
                return "server1c_config.json";
            }
            case "BASE1C" -> {
                return "base1c_config.json";
            }
            case "TASKS" -> {
                return "test_task1.json";
            }
        }
        return "";
*/
        if (Config.equals("SERVERSQL"))
            return "config//server_sql_config.json";
        else if (Config.equals("SERVER1C")) {
            return "config//server1c_config.json";
        } else if (Config.equals("BASE1C")) {
            return "config//base1c_config.json";
        } else if (Config.equals("TASKS")) {
            return "test_task1.json";
        }
        return "";
    }

    public static List<Base1c> loadSettingsBase1c(String filePath) throws IOException {

        //read json file data to String
        String jsonData = Files.readString(Paths.get(filePath));
        jsonData = jsonData.replaceAll("[^\\u0009\\u000a\\u000d\\u0020-\\uD7FF\\uE000-\\uFFFD]", "");
        jsonData = jsonData.replaceAll("[\\uD83D\\uFFFD\\uFE0F\\u203C\\u3010\\u3011\\u300A\\u166D\\u200C\\u202A\\u202C\\u2049\\u20E3\\u300B\\u300C\\u3030\\u065F\\u0099\\u0F3A\\u0F3B\\uF610\\uFFFC\\uFEFF]", "");
        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.readValue(jsonData, new TypeReference<List<Base1c>>() {
        });
    }
    public static List<Base1c> loadSettingsBase1c() throws IOException {
        return loadSettingsBase1c(getConfigFile("BASE1C"));
    }

    public static List<Server1c> loadSettingsServer1c(String filePath) throws IOException {

        //read json file data to String
        String jsonData = Files.readString(Paths.get(filePath));
        jsonData = jsonData.replaceAll("[^\\u0009\\u000a\\u000d\\u0020-\\uD7FF\\uE000-\\uFFFD]", "");
        jsonData = jsonData.replaceAll("[\\uD83D\\uFFFD\\uFE0F\\u203C\\u3010\\u3011\\u300A\\u166D\\u200C\\u202A\\u202C\\u2049\\u20E3\\u300B\\u300C\\u3030\\u065F\\u0099\\u0F3A\\u0F3B\\uF610\\uFFFC\\uFEFF]", "");
        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.readValue(jsonData, new TypeReference<List<Server1c>>() {
        });

    }

    public static List<Server1c> loadSettingsServer1c() throws IOException {
        return loadSettingsServer1c(getConfigFile("SERVER1C"));
    }

    public static List<ServerSql> loadSettingsServerSQL(String filePath) throws IOException {

        //read json file data to String
        String jsonData = Files.readString(Paths.get(filePath));
        jsonData = jsonData.replaceAll("[^\\u0009\\u000a\\u000d\\u0020-\\uD7FF\\uE000-\\uFFFD]", "");
        jsonData = jsonData.replaceAll("[\\uD83D\\uFFFD\\uFE0F\\u203C\\u3010\\u3011\\u300A\\u166D\\u200C\\u202A\\u202C\\u2049\\u20E3\\u300B\\u300C\\u3030\\u065F\\u0099\\u0F3A\\u0F3B\\uF610\\uFFFC\\uFEFF]", "");
        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.readValue(jsonData, new TypeReference<List<ServerSql>>() {
        });

    }

    public static List<ServerSql> loadSettingsServerSQL() throws IOException {
        return loadSettingsServerSQL(getConfigFile("SERVERSQL"));
    }

    public static List<Tasks> loadTasks(String filePath) throws IOException {

        //read json file data to String
        String jsonData = Files.readString(Paths.get(filePath));
        jsonData = jsonData.replaceAll("[^\\u0009\\u000a\\u000d\\u0020-\\uD7FF\\uE000-\\uFFFD]", "");
        jsonData = jsonData.replaceAll("[\\uD83D\\uFFFD\\uFE0F\\u203C\\u3010\\u3011\\u300A\\u166D\\u200C\\u202A\\u202C\\u2049\\u20E3\\u300B\\u300C\\u3030\\u065F\\u0099\\u0F3A\\u0F3B\\uF610\\uFFFC\\uFEFF]", "");
        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.readValue(jsonData, new TypeReference<List<Tasks>>() {
        });

    }

    public static List<Tasks> loadTasks() throws IOException {
        return loadTasks(getConfigFile("TASKS"));
    }

    public void setServer1cConfigFile(String server1cConfigFile) {
        this.server1cConfigFile = server1cConfigFile;
    }
}