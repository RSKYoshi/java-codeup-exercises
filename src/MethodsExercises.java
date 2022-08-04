import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Addition:%n");
        String addX = sc.next();
        double addDX = Double.parseDouble(addX);
        String addY = sc.next();
        double addDY = Double.parseDouble(addY);
           addition(addDX, addDY);

        sc.nextLine();
        System.out.printf("%n%nSubtraction: Enter number to subtract from first, then enter next number to subtract from first number:%n");
        String subX = sc.next();
        double subDX = Double.parseDouble(subX);
        String subY = sc.next();
        double subDY = Double.parseDouble(subY);
            subtraction(subDX, subDY);

        sc.nextLine();
        System.out.printf("%n%nMultiplication:%n");
        String mulX = sc.next();
        double mulDX = Double.parseDouble(mulX);
        String mulY = sc.next();
        double mulDY = Double.parseDouble(mulY);
            multiplication(mulDX, mulDY);

        sc.nextLine();
        System.out.printf("%n%nDivision:%n");
//        double divIntx = Double.parseDouble(sc.next());
//        double divInty = Double.parseDouble(sc.next());
        String divX = sc.next();
        double divDX = Double.parseDouble(divX);
        String divY = sc.next();
        double divDY = Double.parseDouble(divY);
            division(divDX, divDY);

        sc.nextLine();
        System.out.printf("%n%nModulus:%n");
        String modX =  sc.next();
        double modDX = Double.parseDouble(modX);
        String modY =  sc.next();
        double modDY = Double.parseDouble(modY);
            modulus(modDX,modDY);
    }

    // addition
    public static void addition(double x, double y) {
        double total = x + y;
        System.out.printf("The sum is: %s", total);
        }
    // subtract
    public static void subtraction(double x, double y) {
        double total = x - y;
        System.out.printf("The difference is: %s", total);
    }
    // multiply
    public static void multiplication(double x, double y) {
        double total = x * y;
        System.out.printf("The product is: %s", total);
    }
    // divide
    public static void division(double x, double y) {

        if ( x==0 || y == 0) {
            System.out.println("The quotient is: 0");
        } else {
            double total = x / y;
            System.out.printf("The quotient is: %s", total);
        }
    }
    // modulus
    public static void modulus(double x, double y) {
        double total = x % y;
        System.out.printf("The equivalence is: %s", total);
    }
}
