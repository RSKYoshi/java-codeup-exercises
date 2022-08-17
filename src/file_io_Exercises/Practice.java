package file_io_Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) throws IOException {
        Path demoFolder = Paths.get("/Users", "owner", "IdeaProjects", "codeup-java-exercises", "src", "ioExercise");
        System.out.println("Does this folder exist?" + Files.exists(demoFolder));

        Path demoFile = Paths.get("/Users", "owner", "IdeaProjects", "codeup-java-exercises", "src", "ioExercise", "test.txt");
        System.out.println("Does this file exist?" + Files.exists(demoFile));

        if(Files.exists(demoFolder)){
            System.out.println("This folder already exists!");
        } else {
            Files.createDirectories(demoFolder);
        }
        if(Files.exists(demoFile)){
            System.out.println("Hey the file already exists!");
        } else Files.createFile(demoFile);

//        /Users/owner/IdeaProjects/codeup-java-exercises/src

//        Files.createDirectories(demoFolder);
//        Files.createFile(demoFile);

        //make some fruits and write them to a file

        List<String> fruits = Arrays.asList("banana", "plum", "orange", "pears");
        Files.write(demoFile, fruits);

        List<String> fruitDB = Files.readAllLines(demoFile);
        System.out.println(fruitDB);

        fruitDB.remove("banana");
        System.out.println(fruitDB);
        //Below StandardOpenOption.APPEND will add to the file instead of overwriting or creating a new file
        Files.write(demoFile, fruitDB, StandardOpenOption.APPEND);


    }

}
