package Modul_10;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SerializationAndDeserialization {
    public static void main(String[] args) throws IOException {
            List<UserDto> users = new ArrayList<>();
            Scanner scanner = new Scanner(new FileInputStream("src/main/java/file.txt"));
            scanner.nextLine();
            while (scanner.hasNext()) {
                String sourceString = scanner.nextLine();
                String[] strArray = sourceString.split(" ");
                users.add(new UserDto(strArray[0], Integer.parseInt(strArray[1])));
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter writer = new FileWriter("users.json");
            gson.toJson(users, writer);
            writer.close();
        }
        }




