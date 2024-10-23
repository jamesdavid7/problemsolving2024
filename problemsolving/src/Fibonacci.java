public class Fibonacci {
    public static void printFibonacciByRange(int range) {
        int prev2 = 0;
        int prev1 = 1;
        System.out.println(prev2);
        System.out.println(prev1);
        while(prev1 < range) {
            int fibo = prev2 + prev1;
            System.out.println(fibo);
            prev2 = prev1;
            prev1 = fibo;
        }
    }

    public static void printFibonacciByTimes(int times) {
        int prev2 = 0;
        int prev1 = 1;
        int seq = 1;
        System.out.println(prev2);
        System.out.println(prev1);
        while(seq <= times) {
            int fibo = prev2 + prev1;
            System.out.println(fibo);
            prev2 = prev1;
            prev1 = fibo;
            seq++;
        }
    }

    public static void main(String[] args) {
//        printFibonacciByRange(18);
        printFibonacciByTimes(18);
    }
}
