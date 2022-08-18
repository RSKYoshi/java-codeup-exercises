package movies;
//package java_two.array_exercise;
import jdk.swing.interop.SwingInterOpUtils;
import util.Input;

import static movies.MoviesArray.findAll;

public class MoviesApplication {
    public static final int INVALID_CHOICE = -1;
    public static final int EXIT_CHOICE = 0;

    private static Movie[] movies;
    public static void main(String[] args) {
        movies=MoviesArray.findAll();
        Input input = new Input();

        // loop until the user says he/she does not wish to continue
        int choice = INVALID_CHOICE;
        while(choice != EXIT_CHOICE) {
            printMenu();

            choice = input.getInt("Enter int: ");

            doChoice(choice);
        }
    }

    private static void printMenu() {
        System.out.printf("""
                %nWhat would you like to do?
                                
                0 - exit
                1 - view all movies
                2 - view movies in the musical category
                3 - view movies in the drama category
                4 - view movies in the animated category
                5 - view movies in the scifi category
                            
                Enter your choice:"""+"%n");
    }

    private static void doChoice(int choice) {
        // TODO: call your functions based on whatever the user's choice is
        switch(choice) {
            case 1:
                // TODO: view all movies
                printMoviesByCategory("all");
                break;
            case 2:
                // TODO: view movies in the musical category
                printMoviesByCategory("musical");
                break;
            case 3:
                // TODO: view movies in the drama category
                printMoviesByCategory("drama");
                break;
            case 4:
                // TODO: view movies in the animated category
                printMoviesByCategory("animated");
                break;
            case 5:
                // TODO: view movies in the scifi category
                printMoviesByCategory("scifi");
                break;
        }
    }

    private static void printMoviesByCategory(String category){
        for(Movie movie: movies){
            if(movie.getCategory().equals(category)||category.equals("all")){
                System.out.println(movie);
            }
        }
    }
}

