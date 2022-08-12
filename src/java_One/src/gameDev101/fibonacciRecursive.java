package java_One.src.gameDev101;

public class fibonacciRecursive {
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        System.out.println(fib(45));
        System.out.println("Time in ms = " + (System.currentTimeMillis()));
    }
    //how can we not calculate the same number over and over again?
}