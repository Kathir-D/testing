
public class ProductOfInt
{
    static int value = 1;
    public static void main(String[] args) {
        product(10);
    }
    public static void product(int a){
        if(a==0){
            System.out.println(value); // prints product after the numbers are multiplied together
            return;
        }
        value = value * a; // updates final value to past value multiplied by initial value
        product(a-1); // updates initial value to indicate which number it is on
    }
}
