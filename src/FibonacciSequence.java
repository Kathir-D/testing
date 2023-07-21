public class FibonacciSequence
{
    //fib(x) = fib(x-1) + fix(x-2);
    //fib(0) = 1
    //fib(1) = 1
    public static void main(String[] args) {
        System.out.println(fib(1));
    }

    public static int fib(int a){
        if(a==1 || a==0){
            return 1;
        }
        return fib(a-1)+fib(a-2);


    }
}