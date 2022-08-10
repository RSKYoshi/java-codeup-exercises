package serverGen;

import java_Two.Person;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"cool", "hot","room temp", "delicious", "fast", "slow","mediocre","smart","athletic","intuitive","delicious"};
        String[] nouns = {"Pacific Ocean", "Mount Rushmore" , "Spam", "Honolulu", "Washington", "Ryan", "Waimea bay", "surfboard", "ball", "car", "San Antonio"};

        //select random noun and adjective here, hyphenate and display name

        String randomAdjective = returnRandomString(adjectives);
        String randomNoun = returnRandomString(nouns);
        String randomName = randomAdjective + "-" + randomNoun;
        System.out.printf("Here is your server name: %n%s", randomName);

    }

    public static String returnRandomString(String []x) {
        return x[(int) (Math.random() * x.length)];
    }





}
//    We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.
//
//        Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//        Create a method that will return a random element from an array of strings.
//        Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.