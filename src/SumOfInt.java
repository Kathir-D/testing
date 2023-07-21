
public class SumOfInt
{

    static int value = 1;
    public static void main(String[] args) {
        sum(5);

    }

    public static void sum(int a){
        if(a==0){
            System.out.println(value);
            return;
        }
        value = value + a;
        sum(a-1);
    }
}
