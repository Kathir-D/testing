
public class ProductOfInt
{
    static int value = 1;
    public static void main(String[] args) {
        product(10);

    }

    public static void product(int a){
        if(a==0){
            System.out.println(value);
            return;
        }
        value = value * a;
        product(a-1);
    }
}
