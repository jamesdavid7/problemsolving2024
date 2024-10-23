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

    public static void printFibonacciByRecursive(int prev2,int prev1,int count,int range) {
        int fibo = prev2 + prev1;
        System.out.println(fibo);
        count = count+1;
        if(count < range) {
            prev2 = prev1;
            prev1 = fibo;
            printFibonacciByRecursive(prev2,prev1,count,range);
        }
    }

    // To find the nth Fibonacci number we can write code based on the mathematic formula for Fibonacci number
    // F(n) = F(n-1) + F(n-2)
    // We can achieve this by recursive method
    public static int getNthFibonacciNumber(int n) {
        if(n <= 1)
            return n;
        else
            return getNthFibonacciNumber(n-1) + getNthFibonacciNumber(n-2);
    }

    public static void main(String[] args) {
//        printFibonacciByRange(18);
//        printFibonacciByTimes(18);



        int prev2 = 0;
        int prev1 = 1;
        System.out.println(prev2);
        System.out.println(prev1);
        int count = 2;
        printFibonacciByRecursive(prev2,prev1,count,10);

        int n = 7;
        int result = getNthFibonacciNumber(n);
        System.out.println("Nth Fibonacci number for n : "+n+" is : "+result);
    }
}
