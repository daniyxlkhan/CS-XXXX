public class Fibonacci {
    public static void main (String[] args) {

    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
}
/* 
fib(4)

return fib(4-1) + fib(4-2)
so
return fib(3)
return fib(2) 
return fib(1) = 1 + fib()
return 1
*/