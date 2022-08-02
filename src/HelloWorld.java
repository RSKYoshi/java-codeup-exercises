public class HelloWorld {
    public static void main(String[] args){
//        System.out.println("Hello, World!");
        System.out.print("Hello, World!");
        System.out.print("");

        int myFavoriteNumber = 7;
        System.out.println();
        System.out.println(myFavoriteNumber);
//        unary operator below ++
//        System.out.println(++myFavoriteNumber);
//          binary operator below
//        System.out.println(myFavoriteNumber+myFavoriteNumber);
//            tab practice and new line below
//        String myString = "My fav num is 7 \n \t new line here, tabbed ";
//        System.out.println(myString);
        String myString = "My fav num is 7";
        System.out.println(myString);
//        float myNumber = 3.14;
        //fix 1
        float myNumber = (float)3.14;
        //fix 2
//        double myNumber = 3.14;
        System.out.println(myNumber);
//          post-increment below
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
//            pre-increment below
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        //not able to run below code, due to "class" being a reserved word
//         String class = "string";
        //below does not work, due to "three" still being a string inside of a declared int
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);

        //#13 to refactor:
//        int x1 = 4;
//        x1 = x1 + 5;
//        System.out.println(x1);
        //# 13 refactored:
        int x1 = 4;
        x1+=5;
        System.out.println(x1);

        //#13 to refactor
//        int i = 3;
//        int y = 4;
//        y = y * i;
//        System.out.println(y);
//       #13 refactored:
        int i = 3;
        int y = 4;
        y*=i;
        System.out.println(y);

//      #13 to refactor:
//        int x7 = 10;
//        int y7 = 2;
//        x7 = x7 / y7;
//        y7 = y7 - x7;
//        System.out.println(x7);
//        System.out.println(y7);

//        #13 refactored:

        int x7 = 10;
        int y7 = 2;
        x7 /= y7;
        y7-=x7;
        System.out.println(x7);
        System.out.println(y7);

//        over/under max/min's will need to be casted before running(intelliJ will suggest to cast)
//        byte overMax = 128;
//        byte underMin = -129;

        //below is when an integer is incremented past its limits; the result will be the integer starting over at its lowest value
        byte IncrementPast = 127;
        IncrementPast++;
        IncrementPast++;

        System.out.println(IncrementPast);

    }
}


