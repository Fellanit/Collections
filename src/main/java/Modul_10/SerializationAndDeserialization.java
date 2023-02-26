package Modul_10;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SerializationAndDeserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<UserDto> array = new ArrayList<>();
        UserDto userDto = new UserDto();
        InputStream fis = new FileInputStream("src/main/java/file.txt");
        Scanner scanner = new Scanner(fis);
        scanner.nextLine();
        while (scanner.hasNext()) {
            String sourceString = scanner.nextLine();
            String[] strArray = sourceString.split(" ");
            String userName = strArray[0];
            int userAge = Integer.parseInt(strArray[1]);

            userDto.setName(userName);
            userDto.setAge(userAge);
            array.add(userDto);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String toJson = gson.toJson(userDto);
            System.out.println(toJson);
            OutputStream fos = new FileOutputStream("users.json",true);
            fos.write(toJson.getBytes());
        }
    }
}



