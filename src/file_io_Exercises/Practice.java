package file_io_Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

    }

}
