public class FibonacciSequence
{
    //fib(x) = fib(x-1) + fix(x-2);
    //fib(0) = 1
    //fib(1) = 1
    public static void main(String[] args) {
        System.out.println(fib(1));
    }
    public static int fib(int a){
        if(a==1 || a==0){ // if value  is 0 or 1 returns 1 || start with 2 or more
            return 1;
        }
        return fib(a-1)+fib(a-2); // fib = startingValue-1  +  startingValue-2
    }
}